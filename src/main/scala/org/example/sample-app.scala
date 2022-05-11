package org.example
import org.apache.spark.sql.SparkSession

object SparkSessionTest extends App{

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("sample-application")
    .getOrCreate();

  println("********SparkContext********")
  
  println("APP Name :"+spark.sparkContext.appName);
  println("Deploy Mode :"+spark.sparkContext.deployMode);
  println("Master :"+spark.sparkContext.master);

  println("********SparkContext.getConf********")

  val arrayConfig=spark.sparkContext.getConf.getAll
  for (conf <- arrayConfig)
    println(conf)

}
