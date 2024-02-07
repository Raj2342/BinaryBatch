import java.util.Scanner;

public   class sohan {

    public static void main(String[] args) {

        VideoStore videoStore = new VideoStore();
        int choice;
        boolean status = true;

        // Infinite loop for the main menu
        while (status) {
            System.out.println("MAIN MENU");
            System.out.println("*");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Videos");
            System.out.println("3. Return Videos");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            // Scanner for user input
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            // Switch statement to handle user choices
            switch (choice) {
                case 1: {
                    // Add Videos
                    System.out.println("Enter the number of videos you want to add:");
                    int numVideos = sc.nextInt();

                    sc.nextLine(); // Consume the newline character

                    String[] videoNames = new String[numVideos];

                    for (int i = 0; i < numVideos; i++) {
                        System.out.println("Enter the name of video #" + (i + 1) + ":");
                        videoNames[i] = sc.nextLine();
                    }

                    videoStore.addVideo(videoNames);
                    break;
                }
                case 2:
                    // Check Out Videos
                    System.out.println("Enter the name of video to checkout:");
                    String videoName = sc.next();
                    videoStore.doCheckOut(videoName);
                    break;
                case 3:
                    // Return Videos
                    System.out.println("Enter the video name to return:");
                    videoName = sc.next();
                    videoStore.doReturn(videoName);
                    break;
                case 4:
                    // Receive Rating
                    System.out.println("Enter the name of video you want to rate:");
                    videoName = sc.next();
                    System.out.println("Enter the Ratings for this video:");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(videoName, rating);
                    break;
                case 5:
                    // List Inventory
                    videoStore.listInventory();
                    break;
                case 6:
                    // Exit
                    System.out.println("Exiting...!! Thanks for using the application");
                    sc.close();
                    videoStore.exit();
                    status = false; // Set status to false to exit the loop
                    break;
                default:
                    System.out.println("Wrong input!!");
            }
        }
    }
}

class Video {
    String videoName;
    boolean checkOut;
    int rating;

    public Video(String videoName) {
        this.videoName = videoName;
    }

    String getName() {
        return videoName;
    }

    void doCheckOut() {
        this.checkOut = true;
    }

    void doReturn() {
        this.checkOut = false;
    }

    void receiveRating(int rating) {
        this.rating = rating;
    }

    int getRating() {
        return rating;
    }

    boolean getCheckOut() {
        return checkOut;
    }
}

class VideoStore {
    Video[] store = new Video[20];
    int a = 0;

    void addVideo(String[] names) {
        for (String name : names) {
            store[a] = new Video(name);
            store[a].checkOut = false;
            store[a].receiveRating(0);
            System.out.println("Video " + name + " added successfully");
            a++;
        }
    }

    void doCheckOut(String name) {
        boolean videoFound = false;

        for (int i = 0; i < a; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckOut();
                System.out.println("Video " + name + " removed successfully from location " + i);
                videoFound = true;
                break;
            }
        }

        if (!videoFound) {
            System.out.println("No such video exists.");
        }
    }

    void doReturn(String name) {
        boolean videoFound = false;
        for (int i = 0; i < a; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video returned: " + name + " to location " + i);
                videoFound = true;
                break;
            }
        }
        if (!videoFound) {
            System.out.println("No such video exists.");

        }
    }

    void receiveRating(String name, int rating) {
        for (int i = 0; i < a; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
            }
        }
        System.out.println("Rating " + rating + " has been mapped to the video " + name);
    }

    void listInventory() {
        for (int i = 0; i < a; i++) {
            if (!store[i].getCheckOut()) {
                System.out.print("Video (location " + i + "): " + store[i].videoName);
                System.out.print(" Ratings (location " + i + "): " + store[i].getRating() + "\n");
            }
        }
    }

    public void exit() {
        System.exit(0);
    }
}