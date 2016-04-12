/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graphaware.integration.neo4j.test;

import java.util.Map;

public interface GraphDatabaseServiceWrapper {
    void startEmbeddedServer();
    void startEmbeddedServer(Map<String, Object> parameters);
    void stopEmbeddedServer();
    void populate(String cypher);
}
