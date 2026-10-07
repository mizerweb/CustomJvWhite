package one.me.sdk.media.ffmpeg;

import defpackage.gbb;
import defpackage.j95;
import defpackage.ore;
import defpackage.ry0;
import java.io.File;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007JL\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0007JB\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0007¨\u0006\u0019"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory;", "", "<init>", "()V", "create", "Lone/me/sdk/media/ffmpeg/AnimatedFileDrawable;", "config", "Lone/me/sdk/media/ffmpeg/WebmFactory$Config;", "createByFile", "file", "Ljava/io/File;", "preCache", "", "width", "", "height", "limitFps", "decodeFirstFrame", "autoStart", "createByUrl", MLFeatureConfigProviderBase.URL_KEY, "", "networkFetchEnabled", "Config", "Way", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebmFactory {
    public static final WebmFactory INSTANCE = new WebmFactory();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B%\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", "", "width", "", "height", "limitFps", "", "<init>", "(IIZ)V", "getWidth$media_ffmpeg", "()I", "getHeight$media_ffmpeg", "getLimitFps$media_ffmpeg", "()Z", "Builder", "File", "Url", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way$File;", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Url;", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Way {
        private final int height;
        private final boolean limitFps;
        private final int width;

        private Way(int i, int i2, boolean z) {
            this.width = i;
            this.height = i2;
            this.limitFps = z;
        }

        /* JADX INFO: renamed from: getHeight$media_ffmpeg, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: getLimitFps$media_ffmpeg, reason: from getter */
        public final boolean getLimitFps() {
            return this.limitFps;
        }

        /* JADX INFO: renamed from: getWidth$media_ffmpeg, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u0013\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Builder;", "B", "", "<init>", "()V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", "limitFps", "", "getLimitFps", "()Z", "setLimitFps", "(Z)V", "(I)Ljava/lang/Object;", "setSize", "(II)Ljava/lang/Object;", "(Z)Ljava/lang/Object;", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Builder<B> {
            private int height;
            private boolean limitFps;
            private int width;

            public Builder() {
                Config.Companion companion = Config.INSTANCE;
                this.width = companion.getDefaultSize();
                this.height = companion.getDefaultSize();
                this.limitFps = companion.getDefaultShouldLimitFps();
            }

            public final int getHeight() {
                return this.height;
            }

            public final boolean getLimitFps() {
                return this.limitFps;
            }

            public final int getWidth() {
                return this.width;
            }

            /* JADX INFO: renamed from: setHeight */
            public final void m38setHeight(int i) {
                this.height = i;
            }

            /* JADX INFO: renamed from: setLimitFps */
            public final void m39setLimitFps(boolean z) {
                this.limitFps = z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final B setSize(int width, int height) {
                this.width = width;
                this.height = height;
                return this;
            }

            /* JADX INFO: renamed from: setWidth */
            public final void m40setWidth(int i) {
                this.width = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final B setHeight(int height) {
                this.height = height;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final B setLimitFps(boolean limitFps) {
                this.limitFps = limitFps;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final B setWidth(int width) {
                this.width = width;
                return this;
            }
        }

        public /* synthetic */ Way(int i, int i2, boolean z, j95 j95Var) {
            this(i, i2, z);
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Way$File;", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", "file", "Ljava/io/File;", "width", "", "height", "limitFps", "", "<init>", "(Ljava/io/File;IIZ)V", "getFile$media_ffmpeg", "()Ljava/io/File;", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class File extends Way {
            private final java.io.File file;

            public /* synthetic */ File(java.io.File file, int i, int i2, boolean z, int i3, j95 j95Var) {
                this(file, (i3 & 2) != 0 ? Config.INSTANCE.getDefaultSize() : i, (i3 & 4) != 0 ? Config.INSTANCE.getDefaultSize() : i2, (i3 & 8) != 0 ? Config.INSTANCE.getDefaultShouldLimitFps() : z);
            }

            /* JADX INFO: renamed from: getFile$media_ffmpeg, reason: from getter */
            public final java.io.File getFile() {
                return this.file;
            }

            public File(java.io.File file, int i, int i2, boolean z) {
                super(i, i2, z, null);
                this.file = file;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Url;", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", MLFeatureConfigProviderBase.URL_KEY, "", "networkFetchEnabled", "", "width", "", "height", "limitFps", "<init>", "(Ljava/lang/String;ZIIZ)V", "getUrl$media_ffmpeg", "()Ljava/lang/String;", "getNetworkFetchEnabled$media_ffmpeg", "()Z", "Builder", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Url extends Way {
            private final boolean networkFetchEnabled;
            private final String url;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Url$Builder;", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Builder;", "<init>", "()V", MLFeatureConfigProviderBase.URL_KEY, "", "networkFetchEnabled", "", "setUrl", "setNetworkFetchEnabled", "build", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way$Url;", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Builder<Builder> {
                private boolean networkFetchEnabled = Config.INSTANCE.getDefaultNetworkFetchEnabled();
                private String url;

                public final Url build() {
                    String str = this.url;
                    if (str == null) {
                        str = null;
                    }
                    return new Url(str, this.networkFetchEnabled, getWidth(), getHeight(), getLimitFps());
                }

                public final Builder setNetworkFetchEnabled(boolean networkFetchEnabled) {
                    this.networkFetchEnabled = networkFetchEnabled;
                    return this;
                }

                public final Builder setUrl(String str) {
                    this.url = str;
                    return this;
                }
            }

            public /* synthetic */ Url(String str, boolean z, int i, int i2, boolean z2, int i3, j95 j95Var) {
                this(str, (i3 & 2) != 0 ? Config.INSTANCE.getDefaultNetworkFetchEnabled() : z, (i3 & 4) != 0 ? Config.INSTANCE.getDefaultSize() : i, (i3 & 8) != 0 ? Config.INSTANCE.getDefaultSize() : i2, (i3 & 16) != 0 ? Config.INSTANCE.getDefaultShouldLimitFps() : z2);
            }

            /* JADX INFO: renamed from: getNetworkFetchEnabled$media_ffmpeg, reason: from getter */
            public final boolean getNetworkFetchEnabled() {
                return this.networkFetchEnabled;
            }

            /* JADX INFO: renamed from: getUrl$media_ffmpeg, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public Url(String str, boolean z, int i, int i2, boolean z2) {
                super(i, i2, z2, null);
                this.url = str;
                this.networkFetchEnabled = z;
            }
        }
    }

    private WebmFactory() {
    }

    public static final AnimatedFileDrawable create(Config config) {
        Way way = config.getWay();
        if (way instanceof Way.File) {
            return createByFile$default(((Way.File) way).getFile(), config.getPreCache(), way.getWidth(), way.getHeight(), way.getLimitFps(), false, config.getAutoStart(), 32, null);
        }
        if (way instanceof Way.Url) {
            Way.Url url = (Way.Url) way;
            return createByUrl(url.getUrl(), way.getWidth(), way.getHeight(), way.getLimitFps(), url.getNetworkFetchEnabled(), config.getAutoStart());
        }
        ore.o();
        return null;
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean preCache, int width, int height, boolean limitFps, boolean decodeFirstFrame, boolean autoStart) {
        AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, width, height, preCache ? new ry0() : null, null);
        animatedFileDrawable.setLimitFps(limitFps);
        animatedFileDrawable.setAllowDecodeSingleFrame(decodeFirstFrame);
        if (autoStart) {
            animatedFileDrawable.start();
        }
        return animatedFileDrawable;
    }

    public static /* synthetic */ AnimatedFileDrawable createByFile$default(File file, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = Config.INSTANCE.getDefaultPrecache();
        }
        if ((i3 & 4) != 0) {
            i = Config.INSTANCE.getDefaultSize();
        }
        if ((i3 & 8) != 0) {
            i2 = Config.INSTANCE.getDefaultSize();
        }
        if ((i3 & 16) != 0) {
            z2 = Config.INSTANCE.getDefaultShouldLimitFps();
        }
        if ((i3 & 32) != 0) {
            z3 = Config.INSTANCE.getDefaultStartDecodeFirstFrame();
        }
        if ((i3 & 64) != 0) {
            z4 = Config.INSTANCE.getDefaultAutoStart();
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return createByFile(file, z, i, i2, z2, z5, z6);
    }

    public static final AnimatedFileDrawable createByUrl(String str, int width, int height, boolean limitFps, boolean networkFetchEnabled, boolean autoStart) {
        AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(null, width, height, null, str);
        animatedFileDrawable.setLimitFps(limitFps);
        animatedFileDrawable.setAllowDecodeSingleFrame(true);
        if (autoStart) {
            animatedFileDrawable.start();
        }
        gbb.a(str, 2, networkFetchEnabled).b(animatedFileDrawable);
        return animatedFileDrawable;
    }

    public static /* synthetic */ AnimatedFileDrawable createByUrl$default(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = Config.INSTANCE.getDefaultSize();
        }
        if ((i3 & 4) != 0) {
            i2 = Config.INSTANCE.getDefaultSize();
        }
        if ((i3 & 8) != 0) {
            z = Config.INSTANCE.getDefaultShouldLimitFps();
        }
        if ((i3 & 16) != 0) {
            z2 = Config.INSTANCE.getDefaultNetworkFetchEnabled();
        }
        if ((i3 & 32) != 0) {
            z3 = Config.INSTANCE.getDefaultAutoStart();
        }
        boolean z4 = z3;
        boolean z5 = z;
        return createByUrl(str, i, i2, z5, z2, z4);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001c"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Config;", "", "way", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", "preCache", "", "autoRepeat", "autoStart", "<init>", "(Lone/me/sdk/media/ffmpeg/WebmFactory$Way;ZZZ)V", "getWay$media_ffmpeg", "()Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", "setWay$media_ffmpeg", "(Lone/me/sdk/media/ffmpeg/WebmFactory$Way;)V", "getPreCache$media_ffmpeg", "()Z", "setPreCache$media_ffmpeg", "(Z)V", "getAutoRepeat$media_ffmpeg", "setAutoRepeat$media_ffmpeg", "getAutoStart$media_ffmpeg", "setAutoStart$media_ffmpeg", "setPreCache", "setAutoRepeat", "setAutoStart", "setWay", "Builder", "Companion", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Config {
        private static boolean defaultAutoStart;
        private static boolean defaultPrecache;
        private static boolean defaultStartDecodeFirstFrame;
        private boolean autoRepeat;
        private boolean autoStart;
        private boolean preCache;
        private Way way;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static int defaultSize = 200;
        private static boolean defaultShouldLimitFps = true;
        private static boolean defaultAutoRepeat = true;
        private static boolean defaultNetworkFetchEnabled = true;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Config$Builder;", "", "<init>", "()V", "way", "Lone/me/sdk/media/ffmpeg/WebmFactory$Way;", "preCache", "", "autoRepeat", "autoStart", "startDecodeFirstFrame", "setPreCache", "setAutoRepeat", "setAutoStart", "setStartDecodeFirstFrame", "setWay", "build", "Lone/me/sdk/media/ffmpeg/WebmFactory$Config;", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder {
            private boolean autoRepeat;
            private boolean autoStart;
            private boolean preCache;
            private boolean startDecodeFirstFrame;
            private Way way;

            public Builder() {
                Companion companion = Config.INSTANCE;
                this.preCache = companion.getDefaultPrecache();
                this.autoRepeat = companion.getDefaultAutoRepeat();
                this.autoStart = companion.getDefaultAutoStart();
                this.startDecodeFirstFrame = companion.getDefaultStartDecodeFirstFrame();
            }

            public final Config build() {
                Way way = this.way;
                if (way == null) {
                    way = null;
                }
                return new Config(way, this.preCache, this.autoRepeat, this.autoStart);
            }

            public final Builder setAutoRepeat(boolean autoRepeat) {
                this.autoRepeat = autoRepeat;
                return this;
            }

            public final Builder setAutoStart(boolean autoStart) {
                this.autoStart = autoStart;
                return this;
            }

            public final Builder setPreCache(boolean preCache) {
                this.preCache = preCache;
                return this;
            }

            public final Builder setStartDecodeFirstFrame(boolean startDecodeFirstFrame) {
                this.startDecodeFirstFrame = startDecodeFirstFrame;
                return this;
            }

            public final Builder setWay(Way way) {
                this.way = way;
                return this;
            }
        }

        public /* synthetic */ Config(Way way, boolean z, boolean z2, boolean z3, int i, j95 j95Var) {
            this(way, (i & 2) != 0 ? defaultPrecache : z, (i & 4) != 0 ? defaultAutoRepeat : z2, (i & 8) != 0 ? defaultAutoStart : z3);
        }

        public static final boolean getDefaultAutoRepeat() {
            return INSTANCE.getDefaultAutoRepeat();
        }

        public static final boolean getDefaultAutoStart() {
            return INSTANCE.getDefaultAutoStart();
        }

        public static final boolean getDefaultNetworkFetchEnabled() {
            return INSTANCE.getDefaultNetworkFetchEnabled();
        }

        public static final boolean getDefaultPrecache() {
            return INSTANCE.getDefaultPrecache();
        }

        public static final boolean getDefaultShouldLimitFps() {
            return INSTANCE.getDefaultShouldLimitFps();
        }

        public static final int getDefaultSize() {
            return INSTANCE.getDefaultSize();
        }

        public static final boolean getDefaultStartDecodeFirstFrame() {
            return INSTANCE.getDefaultStartDecodeFirstFrame();
        }

        public static final void setDefaultAutoRepeat(boolean z) {
            INSTANCE.setDefaultAutoRepeat(z);
        }

        public static final void setDefaultAutoStart(boolean z) {
            INSTANCE.setDefaultAutoStart(z);
        }

        public static final void setDefaultNetworkFetchEnabled(boolean z) {
            INSTANCE.setDefaultNetworkFetchEnabled(z);
        }

        public static final void setDefaultPrecache(boolean z) {
            INSTANCE.setDefaultPrecache(z);
        }

        public static final void setDefaultShouldLimitFps(boolean z) {
            INSTANCE.setDefaultShouldLimitFps(z);
        }

        public static final void setDefaultSize(int i) {
            INSTANCE.setDefaultSize(i);
        }

        public static final void setDefaultStartDecodeFirstFrame(boolean z) {
            INSTANCE.setDefaultStartDecodeFirstFrame(z);
        }

        /* JADX INFO: renamed from: getAutoRepeat$media_ffmpeg, reason: from getter */
        public final boolean getAutoRepeat() {
            return this.autoRepeat;
        }

        /* JADX INFO: renamed from: getAutoStart$media_ffmpeg, reason: from getter */
        public final boolean getAutoStart() {
            return this.autoStart;
        }

        /* JADX INFO: renamed from: getPreCache$media_ffmpeg, reason: from getter */
        public final boolean getPreCache() {
            return this.preCache;
        }

        /* JADX INFO: renamed from: getWay$media_ffmpeg, reason: from getter */
        public final Way getWay() {
            return this.way;
        }

        public final Config setAutoRepeat(boolean autoRepeat) {
            this.autoRepeat = autoRepeat;
            return this;
        }

        public final void setAutoRepeat$media_ffmpeg(boolean z) {
            this.autoRepeat = z;
        }

        public final Config setAutoStart(boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        public final void setAutoStart$media_ffmpeg(boolean z) {
            this.autoStart = z;
        }

        public final Config setPreCache(boolean preCache) {
            this.preCache = preCache;
            return this;
        }

        public final void setPreCache$media_ffmpeg(boolean z) {
            this.preCache = z;
        }

        public final Config setWay(Way way) {
            this.way = way;
            return this;
        }

        public final void setWay$media_ffmpeg(Way way) {
            this.way = way;
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R$\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmFactory$Config$Companion;", "", "<init>", "()V", "defaultSize", "", "getDefaultSize$annotations", "getDefaultSize", "()I", "setDefaultSize", "(I)V", "defaultShouldLimitFps", "", "getDefaultShouldLimitFps$annotations", "getDefaultShouldLimitFps", "()Z", "setDefaultShouldLimitFps", "(Z)V", "defaultAutoRepeat", "getDefaultAutoRepeat$annotations", "getDefaultAutoRepeat", "setDefaultAutoRepeat", "defaultAutoStart", "getDefaultAutoStart$annotations", "getDefaultAutoStart", "setDefaultAutoStart", "defaultStartDecodeFirstFrame", "getDefaultStartDecodeFirstFrame$annotations", "getDefaultStartDecodeFirstFrame", "setDefaultStartDecodeFirstFrame", "defaultNetworkFetchEnabled", "getDefaultNetworkFetchEnabled$annotations", "getDefaultNetworkFetchEnabled", "setDefaultNetworkFetchEnabled", "defaultPrecache", "getDefaultPrecache$annotations", "getDefaultPrecache", "setDefaultPrecache", "media-ffmpeg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j95 j95Var) {
                this();
            }

            public static /* synthetic */ void getDefaultAutoRepeat$annotations() {
            }

            public static /* synthetic */ void getDefaultAutoStart$annotations() {
            }

            public static /* synthetic */ void getDefaultNetworkFetchEnabled$annotations() {
            }

            public static /* synthetic */ void getDefaultPrecache$annotations() {
            }

            public static /* synthetic */ void getDefaultShouldLimitFps$annotations() {
            }

            public static /* synthetic */ void getDefaultSize$annotations() {
            }

            public static /* synthetic */ void getDefaultStartDecodeFirstFrame$annotations() {
            }

            public final boolean getDefaultAutoRepeat() {
                return Config.defaultAutoRepeat;
            }

            public final boolean getDefaultAutoStart() {
                return Config.defaultAutoStart;
            }

            public final boolean getDefaultNetworkFetchEnabled() {
                return Config.defaultNetworkFetchEnabled;
            }

            public final boolean getDefaultPrecache() {
                return Config.defaultPrecache;
            }

            public final boolean getDefaultShouldLimitFps() {
                return Config.defaultShouldLimitFps;
            }

            public final int getDefaultSize() {
                return Config.defaultSize;
            }

            public final boolean getDefaultStartDecodeFirstFrame() {
                return Config.defaultStartDecodeFirstFrame;
            }

            public final void setDefaultAutoRepeat(boolean z) {
                Config.defaultAutoRepeat = z;
            }

            public final void setDefaultAutoStart(boolean z) {
                Config.defaultAutoStart = z;
            }

            public final void setDefaultNetworkFetchEnabled(boolean z) {
                Config.defaultNetworkFetchEnabled = z;
            }

            public final void setDefaultPrecache(boolean z) {
                Config.defaultPrecache = z;
            }

            public final void setDefaultShouldLimitFps(boolean z) {
                Config.defaultShouldLimitFps = z;
            }

            public final void setDefaultSize(int i) {
                Config.defaultSize = i;
            }

            public final void setDefaultStartDecodeFirstFrame(boolean z) {
                Config.defaultStartDecodeFirstFrame = z;
            }

            private Companion() {
            }
        }

        public Config(Way way, boolean z) {
            this(way, z, false, false, 12, null);
        }

        public Config(Way way, boolean z, boolean z2) {
            this(way, z, z2, false, 8, null);
        }

        public Config(Way way, boolean z, boolean z2, boolean z3) {
            this.way = way;
            this.preCache = z;
            this.autoRepeat = z2;
            this.autoStart = z3;
        }

        public Config(Way way) {
            this(way, false, false, false, 14, null);
        }
    }

    public static final AnimatedFileDrawable createByUrl(String str, int i) {
        return createByUrl$default(str, i, 0, false, false, false, 60, null);
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean z) {
        return createByFile$default(file, z, 0, 0, false, false, false, 124, null);
    }

    public static final AnimatedFileDrawable createByUrl(String str, int i, int i2) {
        return createByUrl$default(str, i, i2, false, false, false, 56, null);
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean z, int i) {
        return createByFile$default(file, z, i, 0, false, false, false, 120, null);
    }

    public static final AnimatedFileDrawable createByUrl(String str, int i, int i2, boolean z) {
        return createByUrl$default(str, i, i2, z, false, false, 48, null);
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean z, int i, int i2) {
        return createByFile$default(file, z, i, i2, false, false, false, 112, null);
    }

    public static final AnimatedFileDrawable createByUrl(String str, int i, int i2, boolean z, boolean z2) {
        return createByUrl$default(str, i, i2, z, z2, false, 32, null);
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean z, int i, int i2, boolean z2) {
        return createByFile$default(file, z, i, i2, z2, false, false, 96, null);
    }

    public static final AnimatedFileDrawable createByUrl(String str) {
        return createByUrl$default(str, 0, 0, false, false, false, 62, null);
    }

    public static final AnimatedFileDrawable createByFile(File file, boolean z, int i, int i2, boolean z2, boolean z3) {
        return createByFile$default(file, z, i, i2, z2, z3, false, 64, null);
    }

    public static final AnimatedFileDrawable createByFile(File file) {
        return createByFile$default(file, false, 0, 0, false, false, false, 126, null);
    }
}
