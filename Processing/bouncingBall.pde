static class PVector{
      float x,y;
      
    PVector(float x_,float y_){
            x = x_;
            y = y_;
          
    }
      //static method
    static  PVector div(PVector f,float n){
            PVector p = new PVector(f.x/n,f.y/n);
            return p;
          
    }
      
      
      
    void add(PVector v){
            y = y + v.y;
            x = x + v.x;
          
    }
      
    void sub(PVector v){
            y = y - v.y;
            x = x - v.x;
          
    }
    void mult(float n){
            x = x*n;
            y = y*n;
          
    }
    void div(float n){
            x = x/n;
            y = y/n;
          
    }

    float mag(){
            return sqrt(x*x+y*y);
          
    }
      
    void setValue(float x_,float y_){
            x = x_;
            y = y_;
          
    }
      
    void normalize(){
            float m = mag();
        if (m != 0){
                  div(m);
                
        }
          
    }
void limit(float max){
        float m = mag();
    if(m > max){
              x = 0;
              y = 0;
            
    }
      
}

}
  
  class Mover{
        PVector location;
        PVector velocity;
        PVector acceleration;
        
        float mass;
        
      Mover(){
              mass = 1;
              location = new PVector(30,30);
              velocity = new PVector(0,0);
              acceleration = new PVector(0,0);
            
      }
        
      void applyForce(PVector force){
              PVector f = PVector.div(force,mass);
              acceleration.add(f);
            
      }
      void update(){
              velocity.add(acceleration);
              location.add(velocity);
              acceleration.mult(0);
            
      }
      void display(){
              stroke(0);
              fill(175);
              
              ellipse(location.x,location.y,mass*16,mass*16);
            
      }
      void checkEdges(){
          if(location.x > width){
                    location.x = width;
                    velocity.x *= -1;
                  
          }else if(location.x < 0){
                    velocity.x *= -1;
                    location.x = 0;
                  
          }
          if(location.y > height){
                    velocity.y *= -1;
                    location.y = height;
                  
          }else if(location.y < 0){
                    velocity.y *= -1;
                    location.y = 0;
                  
          }
            
      }

  }
  Mover m;
  PVector forceSpeedUp;
  PVector forceBrake;

  void setup(){
        size(600,600);
        smooth();
        forceSpeedUp = new PVector(0.1,0.02);
        forceBrake = new PVector(-0.1,0.02);
        m = new Mover();
        

  }

  void draw(){
      if(mousePressed && mouseButton == LEFT){
              m.applyForce(forceSpeedUp);
            
      }else if(mousePressed && mouseButton == RIGHT){
              m.applyForce(forceBrake);
            
      }
        m.update();
        m.checkEdges();
        m.display();

  }
