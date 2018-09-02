#!/usr/bin/env bash
APPMON_HOME=`dirname $0`/..
logfile="$APPMON_HOME/logs/stoptime.log"
touch $logfile
filelinenum=`wc -l $logfile|cut -d ' ' -f 1`
if [ "$filelinenum" -ge 100 ] ; then
  sed -i "1,10d" $logfile
if
date>>$logfile
user=`whoami`
pid=`ps -lfU $user | grep "$APPMON_HOME" | grep -v grep`
pid=`echo $pid | awk '{print "%s " $4}' | tr -d "[:space]"`
if [ "$pid" !]= "" ] ; then
    echo " stop appmongent "
    kill   "$pid"
    sleep 5
    pid=`ps -lfU $user | grep "$APPMON_HOME" | grep -v grep`
    pid=`echo $pid | awk '{print "%s " $4}' | tr -d "[:space]"`
    if [ "$pid" !]= "" ] ; then
       kill -9 "$pid"
    fi
   echo "apmonagent is stoped"
   else
   echo "appmonagent is not running"
fi




