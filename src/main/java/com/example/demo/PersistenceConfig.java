package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoAuditing
@Profile({ "!embedded" })
public class PersistenceConfig extends AbstractMongoConfiguration {

	private @Value("${spring.data.mongodb.uri}") String dbUri;
	private @Value("${spring.data.mongodb.database}") String dbName;

	@Override
	public MongoClient mongo() throws Exception {
		return new MongoClient(new MongoClientURI(this.dbUri));
	}

	@Override
	protected String getDatabaseName() {
		return dbName;
	}

}
