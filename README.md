# techup-slackbot

_techup-slackbot_ is a bot for Slack that uses the Ktor framework and is meant to be deployed to Heroku. This is part of
the b-nova techhup blog entry.

# Build

You can simply build the techup-slackbot project with the provided Makefile.

```
$ ❯  ./gradlew run
```

# Usage

Once the bot is running, access the `/` endpoint through `http://0.0.0.0:8080` locally. If everything is set correctly,
you'll get the following response:

```
Response is: ChatPostMessageResponse(ok=true, warning=null, error=null, needed=null, provided=null, deprecatedArgument=null, errors=null, responseMetadata=null, channel=C029VDFF8BC, ts=1627908164.001700, message=Message(type=message, subtype=null, team=T07V5FXHS, channel=null, user=U029S7P39TP, username=null, text=Hello :wave:, blocks=null, attachments=null, ts=1627908164.001700, threadTs=null, intro=false, starred=false, wibblr=false, pinnedTo=null, reactions=null, botId=B02A7TBSSQH, botLink=null, displayAsBot=false, botProfile=BotProfile(id=B02A7TBSSQH, deleted=false, name=TechUp Slack Bot, updated=1627885823, appId=A029VDX65M1, icons=BotProfile.Icons(image36=https://a.slack-edge.com/80588/img/plugins/app/bot_36.png, image48=https://a.slack-edge.com/80588/img/plugins/app/bot_48.png, image72=https://a.slack-edge.com/80588/img/plugins/app/service_72.png), teamId=T07V5FXHS), icons=null, file=null, files=null, upload=false, parentUserId=null, inviter=null, clientMsgId=null, comment=null, topic=null, purpose=null, edited=null, unfurlLinks=false, unfurlMedia=false, threadBroadcast=false, locked=false, replies=null, replyCount=null, replyUsers=null, replyUsersCount=null, latestReply=null, subscribed=false, xFiles=null, hidden=false, lastRead=null, root=null, itemType=null, item=null))
http://

```

And a __Hello b-nova! :wave:__ in your target Slack channel.

## Contact

If you want to contact me you can reach me at [info@b-nova.com](info@b-nova.com).

## License

<!--- If you're not sure which open license to use see https://choosealicense.com/--->

This project uses the following license: [MIT License](https://opensource.org/licenses/MIT)
. https://opensource.org/licenses/MIT
http://
