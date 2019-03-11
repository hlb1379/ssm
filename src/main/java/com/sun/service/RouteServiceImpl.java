package com.sun.service;

import com.sun.mapper.TabRouteMapper;
import com.sun.pojo.TabRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RouteServiceImpl implements RouteService {

        @Autowired
        private TabRouteMapper routeMapper;
        public List<TabRoute> list() {
            return routeMapper.selectByExample(null);
        }
    }

}
