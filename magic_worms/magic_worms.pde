void draw() {
  makeMagical();
  for (int i=1; i<301; i++) {
    float r=random(190);
    fill(r, i, 173);
   
    ellipse(getWormX(i), getWormY(i), 50, 50);
  }
  
}

void setup() {
  size(2000, 2000);
  background(79, 146, 162);
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
