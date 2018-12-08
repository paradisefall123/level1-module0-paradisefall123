int yposition=30;
int randomNumber = (int)random(900);
int score=0;
void draw() {
  background(70, 70, 72);
  yposition+=10;
  fill(98, 175, 232);
  stroke(30, 81, 118);
  ellipse(randomNumber, yposition, 20, 40);
   if(yposition>900){
     yposition=0;
     randomNumber=(int)random(900);
    ellipse(randomNumber,yposition,20,40);
  }
  fill(255, 28, 240);
  rect(mouseX+10, 850, 90, 70);
checkCatch(randomNumber);
 fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
} 
void setup() {
  size(900, 900);
}
void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
    score--;
  println("Your score is now: " + score);
}