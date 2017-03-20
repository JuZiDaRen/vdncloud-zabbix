package com.vdncloud.zabbix;

public class ZabbixApiParamter {
       
	public static final int ZABBIX_CLIENT_DEFAULT_PORT = 10050;

    public static final int ITEM_DELAY_DEFAULT = 60;

    private ZabbixApiParamter() {
    }
    
    public static enum HOST_INTERFACE_TYPE {
        AGENT(1), SNMP(2), IPMI(3), JMX(4);


        public int value = 1;

        private HOST_INTERFACE_TYPE(int value) {
            this.value = value;
        }

    }
    
    public static enum HOST_MONITOR_STATUS {
        MONITORED_HOST(0), UNMONITORED_HOST(1);

        public int value;

        private HOST_MONITOR_STATUS(int value) {
            this.value = value;
        }

    }
    
    
    public static enum HOST_AGENT_ACCESS_INTERFACE {
        HOST_DNS(0), IP_ADDRESS(1);

        public int value = 0;

        private HOST_AGENT_ACCESS_INTERFACE(int value) {
            this.value = value;
        }
    }
    
    
	
}
