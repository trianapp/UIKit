object Releases{
      val versionMajor:Int = 1
      val versionMinor:Int = 8
      val versionPatch:Int = 4
      val versionBuild:Int = 5

    var versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100 + versionBuild
    var versionName = "$versionMajor.$versionMinor.$versionPatch"

}