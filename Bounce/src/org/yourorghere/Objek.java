package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {    

    static void Bola(GL gl) {
        float amb[] = {0.192f, 0.192f, 0.192f};
        float diff[] = {0.192f, 0.192f, 0.192f};
        float spec[] = {1f, 1f, 1f};
        float shine = 25.6f;
        
        float BODY_RADIUS = 1.0f;
        int SLICES = 20;
        int STACKS = 30;
        GLU glu = new GLU();
        
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        GLUquadric q = glu.gluNewQuadric();        
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void Bola2(GL gl) {
        float amb[] = {1f, 0f, 0f};
        float diff[] = {0.192f, 0.192f, 0.192f};
        float spec[] = {1f, 1f, 0f};
        float shine = 25.6f;
        
        float BODY_RADIUS = 1.0f;
        int SLICES = 20;
        int STACKS = 30;
        GLU glu = new GLU();
        
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        GLUquadric q = glu.gluNewQuadric();        
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void Tabung(GL gl) {
        //Untuk Material
        float amb_R = 0.0f, amb_G = 0.1f, amb_B = 0.1f,
                amb_Alpha = 0.55f;
        float diff_R = 0.1f, diff_G = 0.0f, diff_B = 0.0f,
                diff_Alpha = 0.55f;
        float spec_R = 0.633f, spec_G = 0.727811f, spec_B = 0.633f,
                spec_Alpha = 0.55f;
        float v_shine = 25.6f;       
        
        float BODY_LENGTH = 5f;
        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        float amb[] = {amb_R, amb_G, amb_B, amb_Alpha};
        float diff[] = {diff_R, diff_G, diff_B, diff_Alpha};
        float spec[] = {spec_R, spec_G, spec_B, spec_Alpha};
        float shine = v_shine;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void Jalan(GL gl){
        gl.glBegin(GL.GL_POLYGON);/* f4: Surface bagian atas (EFGH)*/
        gl.glVertex3f(4.0f, 1.0f, 1.0f); //1  
        gl.glVertex3f(4.0f, -20.0f, 1.0f); //2
        gl.glVertex3f(-4.0f, -20.0f, 1.0f); //3
        gl.glVertex3f(-4.0f, 1.0f, 1.0f); //4
        gl.glEnd();
    }
    
    static void Terowongan(GL gl) {
        //Untuk Material
        float amb_R = 0.0f, amb_G = 0.1f, amb_B = 0.1f,
                amb_Alpha = 0.55f;
        float diff_R = 0.1f, diff_G = 0.0f, diff_B = 0.0f,
                diff_Alpha = 0.55f;
        float spec_R = 0.633f, spec_G = 0.727811f, spec_B = 0.633f,
                spec_Alpha = 0.55f;
        float v_shine = 25.6f;        
        
        float BODY_LENGTH = 8f;
        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        float amb[] = {amb_R, amb_G, amb_B, amb_Alpha};
        float diff[] = {diff_R, diff_G, diff_B, diff_Alpha};
        float spec[] = {spec_R, spec_G, spec_B, spec_Alpha};
        float shine = v_shine;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void Pintu(GL gl) {
        float amb[] = {0.255f, 0.127f, 0.0f};                
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);        
        
        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */        
        gl.glVertex3f(0.0f, 0.0f, -4.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(4.0f, 0.0f, 1.0f);
        gl.glVertex3f(4.0f, 0.0f, -4.0f);
        gl.glEnd();      
    }        
   
}
