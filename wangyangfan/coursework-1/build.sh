#!/bin/bash

# 构建hostCollector模块
cd hostCollector
mvn clean package -DskipTests
cd -

# 构建hostMonitor模块
cd hostMonitor
mvn clean package -DskipTests
cd -

echo "Maven module build success!"