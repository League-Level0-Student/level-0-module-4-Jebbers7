PImage face;
void setup() {
  face = loadImage("googlyeyes.jpeg");
size(800,600);
face.resize(800,600);
}

void draw() {
  background(face);
   
   if(mouseX < 166){
      mouseX = 166; 
   }
    if(mouseX > 289){
      mouseX = 289;
    }
    if(mouseY > 208){
      mouseY = 208;
    }
    if(mouseY < 84){
      mouseY = 84;
    }
    fill(#FFFFFF);
  ellipse(227,146,200,200);
  fill(#050000);
  ellipse(mouseX, mouseY, 75,75);
  fill(#FFFFFF);
  ellipse(575,129,200,200);
  fill(#050000);
  ellipse(mouseX + 348,mouseY,75,75);
  if(mousePressed){
  println(mouseX + " " + mouseY);
}


}
