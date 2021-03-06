package com.lls.api.concise.registry;

import java.util.List;

/************************************
 * NotifyEventListener
 * @author liliangshan
 * @date 2018/12/23
 ************************************/
public interface NotifyEventListener {

    void notify(NotifyEvent event, List<RegistryConfig> configs);

}
