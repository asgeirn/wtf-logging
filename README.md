More Interesting Logging Levels
===============================

John Barnette [proposed](https://twitter.com/#!/jbarnette/status/144791640589078530) revised log levels:

<blockquote class="twitter-tweet tw-align-center"><p>Revised log levels proposal: "fyi," "wtf," and "omg."</p>&mdash; John Barnette (@jbarnette) <a href="https://twitter.com/jbarnette/status/144791640589078530" data-datetime="2011-12-08T14:53:11+00:00">December8, 2011</a></blockquote> <script src="//platform.twitter.com/widgets.js" charset="utf-8"></script>

I have implemented this for Logback.  To use it, simply add the following to your logback.xml:

   <conversionRule conversionWord="wtf" 
                   converterClass="com.asgeirnilsen.blog.logging.WtfLevelConverter" />

You can then use `%wtf` in your `<pattern>` instead of `%level` to produce this type of result:

   22:11:27.965 [main] OMG c.a.blog.logging.WtfLoggerTest - Oh My GOD!
   22:11:27.969 [main] WTF c.a.blog.logging.WtfLoggerTest - What The F*ck just happened?
   22:11:27.969 [main] FYI c.a.blog.logging.WtfLoggerTest - JYI it worked fine.
   22:11:27.969 [main] BTW c.a.blog.logging.WtfLoggerTest - Oh by the way -- test this
 