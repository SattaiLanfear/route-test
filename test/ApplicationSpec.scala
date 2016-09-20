import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._


class ApplicationSpec extends PlaySpec with OneAppPerTest {

  "Routes" should {

    "handle nontrailing" in  {
      route(app, FakeRequest(GET, "/nontrailing")).map(status) mustBe Some(NO_CONTENT)
      route(app, FakeRequest(GET, "/nontrailing/")).map(status) mustBe Some(NOT_FOUND)
    }

    "handle nontrailing - doubled" in  {
      route(app, FakeRequest(GET, "/nontrailing")).map(status) mustBe Some(NO_CONTENT)
      route(app, FakeRequest(GET, "/nontrailing/")).map(status) mustBe Some(NOT_FOUND)
    }

    "handle trailing" in {
      route(app, FakeRequest(GET, "/trailing")).map(status) mustBe Some(NOT_FOUND)
      route(app, FakeRequest(GET, "/trailing/")).map(status) mustBe Some(NO_CONTENT)
    }

  }

}
