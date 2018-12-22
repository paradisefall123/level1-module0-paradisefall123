int yposition=30;
int randomNumber = (int)random(900);
int score=0;
void draw() {
  background(178, 178, 178);
  yposition+=10;
  fill(98, 175, 232);
  stroke(30, 81, 118);
  ellipse(randomNumber, yposition, 20, 40);
  if (yposition>900) {
    yposition=0;
    randomNumber=(int)random(900);
    ellipse(randomNumber, yposition, 20, 40);
  }
  fill(152, 104, 104);
  println(mouseX);
  if(mouseX>810){
    rect(810+0, 850, 90, 70);
  }
 else{ rect(mouseX+10, 850, 90, 70);
 }
  if (yposition>850) {
    checkCatch(randomNumber);
     yposition=0;
    randomNumber=(int)random(900);
  }
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