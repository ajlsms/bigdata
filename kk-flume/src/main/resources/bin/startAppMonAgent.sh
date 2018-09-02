#!/usr/bin/env bash
#h获取当前程序运行路径信息，便于后续使用
APPMON_HOME=`dirname $0`/..
export  APPMON_HOME

# 获取classpath执行的路径信息
CLASSPATH="$APPMON_HOME"/bin:"$APPMON_HOME"/conf:"$APPMON_HOME"/lib/*
export CLASSPATH

PATH=$JAVA_HOME/bin:$PATH
nohup java -Xms 512 -Xmx 512 -DAPP_HOME=$APPMON_HOME -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$APPMON_HOME/logs \
-DLOGGER=A2 -cp $CLASSPATH com.kk.log.AppmonAgent "$APPMON_HOME/conf">>"$APPMON_HOME/logs/appmon.log&