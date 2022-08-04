1.
import scala.io.Source

object Wc {
  def main(args:Array[String]){
    if(args.length!=1){
      System.err.println("Usage:sbt run \"String\"")
      System.exit(1)
    }
    
    val fn = args(0)
    val wc = scala.collection.mutable.Map[String,Int]()
    
    for(line<-Source.fromFile(fn).getLine)
      for(words<-line.split(" "))
        if(wc.contains(word))
          wc(word)=wc(word)+1
        else
          wc(word)=1
    
    for((k,v)<-wc)
      println("Word %s occurs %d times\n",k,v)
    println(wc)
  }
}



2.
import scala.io.Source
object scalaWordCount{
	def main(args: Array[String]){
		if(args.length != 1){
			System.err.println("Usage: sbt run \"word.txt\"")
			System.exit(1)
		}
		val filename=args(0)
		val wordcount = scala.collection.mutable.Map[String,Int]()
		for(line<-Source.fromFile("words.txt").getLines)
			for(word <- line.split(" "))
				wordcount(word) = if(wordcount.contains(word)) wordcount(word) + 1 else 1
			
		for((k,v) <- wordcount)
			printf("Word %s occurs %d times\n", k,v)
		println(wordcount)
	}
}  
