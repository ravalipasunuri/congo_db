package com.congodb;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

public class LoadNodes {

    public static void main(String[] args) {

        String uri = "bolt://localhost:7687";
        String username = "neo4j";
        String password = "your_password";

        try (Driver driver = GraphDatabase.driver(
                uri,
                AuthTokens.basic(username, password))) {

            System.out.println("Connected to Neo4j Graph Database successfully!");

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
