package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Agent;
import com.lambdaschool.orders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AgentsServiceImpl implements AgentsService{

    @Autowired
    private AgentsRepository agentsrepos;

    @Transactional
    @Override
    public Agent save(Agent agent){
        return agentsrepos.save(agent);
    }
}
