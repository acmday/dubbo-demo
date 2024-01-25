package com.acmday.dubbo.demo.provider.config;

/**
 * @author acmday
 * @date 2023/2/19 下午9:32
 */
public enum LevelRequestStateEnum {

    Submitted {
        @Override
        public LevelRequestStateEnum nextState() {
            return Escalated;
        }
        @Override
        public String responsiblePerson() {
            return "acmday";
        }
    },
    Escalated {
        @Override
        public LevelRequestStateEnum nextState() {
            return Escalated;
        }
        @Override
        public String responsiblePerson() {
            return "acmday";
        }
    };

    public abstract LevelRequestStateEnum nextState();

    public abstract String responsiblePerson();
}
