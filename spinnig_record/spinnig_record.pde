PImage pictureOfRecord;
import ddf.minim.*;  
Minim minim;
AudioPlayer song;
int angle=8;
void setup() {
  size(340, 270);
  pictureOfRecord= loadImage("greenday.jpg"); 
  pictureOfRecord.resize(340, 270);
  minim = new Minim(this);
  song = minim.loadFile("greenday.mp3",9092);
}
void draw() {
  if (mousePressed) {
    rotateImage(pictureOfRecord, angle);
    song.play();
  }
  song.pause();
  angle= angle+10;

  image(pictureOfRecord, 1, 1);
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}