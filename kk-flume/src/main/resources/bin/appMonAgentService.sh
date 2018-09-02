#!/usr/bin/env bash
linux_service(){
case "$1" in
          start)
                su - appmon  -c "sh /home/ap/appmon/bin/startAppMonAgent.sh" > /home/ap/appmon/logs/appmon.log
           ;;
           stop)
                su - appmon -c "sh /home/ap/appmon/bin/stopAppmonAgent.sh" > /home/ap/appmon/logs/appmon.log
           ;;
esac
}

os=`uname`
case "$os" in
      AIX)
#          aix_serivce() $*
       ;;
       linux)
           linux_service() $*
        ;;
        HP-UX)
 #          hpux_serice() $*
        ;;
esac