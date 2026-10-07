package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import androidx.media3.session.MediaSessionService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wrk {
    public static final boolean a(Context context, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        Path symbolicLink = Files.readSymbolicLink(Paths.get(zo5.h(parcelFileDescriptor.getFd(), "/proc/self/fd/"), new String[0]));
        if (symbolicLink.startsWith(Paths.get(context.getApplicationInfo().dataDir, new String[0]))) {
            return true;
        }
        String string = symbolicLink.toString();
        return z5h.K0(string, "/proc/", false) || z5h.K0(string, "/data/misc/", false) || z5h.K0(string, "/data/data/", false) || z5h.K0(string, "/dev/", false) || z5h.K0(string, "/sys/", false);
    }

    public static final boolean b(Context context, Uri uri) {
        boolean zA;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        int iHashCode = scheme.hashCode();
        if (iHashCode != 3143036) {
            if (iHashCode != 951530617 || !scheme.equals("content")) {
                return false;
            }
        } else if (!scheme.equals("file")) {
            return false;
        }
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(String.valueOf(uri.getAuthority()), 0);
        if (providerInfoResolveContentProvider == null) {
            return false;
        }
        if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName) && !providerInfoResolveContentProvider.exported && context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0) {
            return false;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    zA = a(context, parcelFileDescriptorOpenFileDescriptor);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(parcelFileDescriptorOpenFileDescriptor, th);
                        throw th2;
                    }
                }
            } else {
                zA = false;
            }
        } catch (IOException e) {
            gm0.V("AndroidFileUtilsNew", "Check for internal uri failed. Uri: " + uri, e);
        } catch (SecurityException e2) {
            gm0.V("AndroidFileUtilsNew", "Lack for read file permission. Uri: " + uri, e2);
        } catch (UnsupportedOperationException e3) {
            gm0.V("AndroidFileUtilsNew", "Probably readSymbolicLink not supported. Uri: " + uri, e3);
        }
        return !zA;
    }

    public static void c(MediaSessionService mediaSessionService, boolean z) {
        mediaSessionService.stopForeground(z ? 1 : 2);
    }
}
