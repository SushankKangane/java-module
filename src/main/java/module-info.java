open module common{
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.data.jpa;
    requires spring.boot;
    requires jakarta.persistence;
    requires lombok;
    requires spring.retry;
    exports com.example.common;
    exports com.example.common.repository;
    exports com.example.common.entity;
}