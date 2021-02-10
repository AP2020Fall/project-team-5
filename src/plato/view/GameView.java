package plato.view;
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.ArcType;
//import javafx.stage.Stage;
//
//public class GameView extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage, Controller controller) {
//        primaryStage.setTitle("Dots and Boxes");
//        Group root = new Group();
//        Canvas canvas = new Canvas(800, 800);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        drawShapes(gc, controller);
//        root.getChildren().add(canvas);
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//    }
//
//    private void drawTheBoard(GraphicsContext gc, Controller controller) {
//        for (int height = 0; height < controller.HEIGHT; height++) {
//            for(int width=0; width<controller.WIDTH-1; width++) {
//                gc.circle(new double[]{width*10, heigh*10, 2});
//                if (controller.rightline[width][height])
//                    gc.strokePolyline(new double[]{10*width, 10*height, 10*width+10, 10*height});
//                else
//                    System.out.print(" ");
//            }
//            gc.circle(new double[]{width*10, heigh*10, 2});
//            if(height!=controller.HEIGHT-1) {
//                for(int width=0; width<controller.WIDTH; width++) {
//                    if (controller.bottomline[width][height])
//                        gc.strokePolyline(new double[]{10*width, 10*height, 10*width, 10*height+10});
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();
//            }
//        }
//
//    }
//}