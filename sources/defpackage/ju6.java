package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Objects;
import java.util.UUID;
import ru.ok.messages.utils.ContextDirCreationException;

/* JADX INFO: loaded from: classes.dex */
public final class ju6 implements rs6 {
    public static volatile String d;
    public static volatile String e;
    public static volatile String f;
    public static final fu6 g = new fu6();
    public final is6 b = new is6("ru.oneme.app.provider");
    public final Context c;

    public ju6(Context context) {
        this.c = context;
    }

    public static String d(Context context) {
        if (e == null) {
            fu6 fu6Var = g;
            Objects.requireNonNull(context);
            if (!qe7.W(false, fu6Var, new rgb(context, 7))) {
                gm0.V("ju6", "getCacheDir fail", new ContextDirCreationException("sandbox"));
            }
            e = context.getCacheDir().getAbsolutePath();
        }
        return e;
    }

    public static File j(String str, String str2) {
        File file = new File(str, str2);
        file.mkdirs();
        return file;
    }

    public static Uri q(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        return parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29 || np4.c(this.c, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final String b() {
        Context context = this.c;
        if (d == null) {
            gm0.n("ju6", "getAppBasePath: try to create");
            if (Build.VERSION.SDK_INT > 29) {
                fu6 fu6Var = g;
                Objects.requireNonNull(context);
                if (!qe7.W(false, fu6Var, new rgb(context, 5))) {
                    gm0.V("ju6", "getAppBasePath fail", new ContextDirCreationException("appbase"));
                }
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    gm0.V("ju6", "externalCache is null", new ContextDirCreationException("externalCacheDir"));
                } else if (!externalCacheDir.exists()) {
                    gm0.V("ju6", "externalCache not exists", new ContextDirCreationException("externalCacheDir"));
                }
                if (externalCacheDir != null) {
                    d = externalCacheDir.getAbsolutePath();
                    if (d == null) {
                        gm0.W("ju6", "getAppBasePath: appBasePath is null", new Object[0]);
                    } else {
                        gm0.n("ju6", "getAppBasePath: appBasePath=" + d);
                    }
                }
            }
            if (d == null) {
                d = d(context);
            }
        }
        return d;
    }

    public final String c() {
        if (f == null) {
            gm0.n("ju6", "getAppFilesPath: try to create");
            fu6 fu6Var = g;
            Context context = this.c;
            Objects.requireNonNull(context);
            if (!qe7.W(false, fu6Var, new rgb(context, 6))) {
                gm0.V("ju6", "getAppFilesPath fail", new ContextDirCreationException("appbase"));
            }
            File filesDir = this.c.getFilesDir();
            if (filesDir == null) {
                gm0.V("ju6", "internalFiles is null", new ContextDirCreationException("internalFilesDir"));
            } else if (!filesDir.exists()) {
                gm0.V("ju6", "internalFiles not exists", new ContextDirCreationException("internalFilesDir"));
            }
            if (filesDir != null) {
                f = filesDir.getAbsolutePath();
                if (f == null) {
                    gm0.W("ju6", "getAppInternalFilesPath: appInternalFilesPath is null", new Object[0]);
                } else {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "ju6", "getAppInternalFilesPath: appInternalFilesPath=" + f, null);
                        }
                    }
                }
            }
        }
        return f;
    }

    public final File e(boolean z) {
        if (!z) {
            return j(b(), "audioCache");
        }
        File file = new File(j(c(), "mediaCache"), "audioCache");
        file.mkdirs();
        return file;
    }

    public final File f(long j) {
        return t("audio_" + j + (ch3.r(".ogg") ? ".wav" : ".ogg"));
    }

    public final File g(long j) {
        return new File(j(b(), "botCommands"), zo5.j(j, "botCommands"));
    }

    public final File h(long j, qs6 qs6Var) {
        File fileJ = j(c(), "mediaCache");
        if (qs6Var.ordinal() != 0) {
            throw new RuntimeException(null, null);
        }
        File file = new File(fileJ, "audioCache");
        file.mkdirs();
        return new File(file, nbh.s(j, "audio_", ".ogg"));
    }

    public final Uri i(Context context, File file) {
        return FileProvider.c(0, context, this.b.a).c(file);
    }

    public final File k(String str) {
        return new File(l(), l21.a(str));
    }

    public final File l() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        File externalFilesDir = Build.VERSION.SDK_INT == 29 ? this.c.getExternalFilesDir(str) : Environment.getExternalStoragePublicDirectory(str);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "MAX");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final File m(String str) {
        return new File(n(), qv1.k("gif_preview", str));
    }

    public final File n() {
        return j(b(), "imageCache");
    }

    public final File o() {
        return j(c(), "upload");
    }

    public final File p(String str, String str2) {
        String strK = !ch3.r(str2) ? qv1.k(".", str2) : "";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        return t(str + strK);
    }

    public final File r() {
        File file = new File(b(), "showcase");
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    public final File s(String str, String str2) {
        return new File(o(), qv1.l("story_", str, ".", str2));
    }

    public final File t(String str) {
        return new File(o(), l21.a(str));
    }

    public final File u(long j) {
        return new File(j(b(), "videoCache"), nbh.s(j, "video_", ".mp4"));
    }

    public final File v(long j) {
        return new File(l(), nbh.s(j, "video_", ".mp4"));
    }

    public final boolean w(String str) {
        String absolutePath = new File(str).getAbsolutePath();
        String absolutePath2 = o().getAbsolutePath();
        String absolutePath3 = j(b(), "upload").getAbsolutePath();
        return (absolutePath.startsWith(absolutePath2) && (absolutePath.startsWith(File.separator, absolutePath2.length()) || absolutePath.length() == absolutePath2.length())) || (absolutePath.startsWith(absolutePath3) && (absolutePath.startsWith(File.separator, absolutePath3.length()) || absolutePath.length() == absolutePath3.length()));
    }
}
