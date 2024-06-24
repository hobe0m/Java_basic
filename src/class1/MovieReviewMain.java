package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        // MovieReview[] reviews = new MovieReview[2];

        movieReviews[0] = new MovieReview(); // 배열에 새로운 객체를 생성해놓고 값을 복사해서 대입해야 한다.
        // MovieReview inception = new MovieReview();
        // inception.title = "인셉션";
        // inception.review = "인생은 무한 루프":
        // reviews[0] = inception;
        movieReviews[0].title = "인셉션";
        movieReviews[0].review = "인생은 무한 루프";

        movieReviews[1] = new MovieReview(); // 배열에 새로운 객체를 생성해놓고 값을 복사해서 대입해야 한다.
        // MovieReview aboutTime = new MovieReview();
        // aboutTime.title = "어바웃 타임";
        // aboutTime.review = "인생 시간 영화!
        // reviews[1] = aboutTime;
        movieReviews[1].title = "어바웃 타임";
        movieReviews[1].review = "인생 시간 영화!";

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화 제목 : " + movieReviews[i].title + ", 리뷰 : " + movieReviews[i].review);
        }


    }
}
