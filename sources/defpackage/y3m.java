package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y3m {
    public static final int a(fe8 fe8Var) {
        return fe8Var.a;
    }

    public static int b(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
            if (strExtractMetadata != null) {
                return Integer.parseInt(strExtractMetadata);
            }
            return 0;
        } catch (Throwable th) {
            gm0.V("y3m", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    public static long c(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Throwable th) {
            gm0.V("y3m", "getVideoDuration: failed ", th);
            return 0L;
        }
    }

    public static mf5 d(Context context, Uri uri) {
        return e(context, uri, np0.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static mf5 e(Context context, Uri uri, int i) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        long j;
        int i2;
        Point point;
        int i3;
        Point point2;
        Point point3;
        ?? point4 = 0;
        Point pointG = null;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        long jC = 0;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                        bitmapCreateScaledBitmap = mediaMetadataRetriever2.getFrameAtTime(-1L);
                        try {
                            jC = c(mediaMetadataRetriever2);
                            pointG = g(mediaMetadataRetriever2);
                            int iB = b(mediaMetadataRetriever2);
                            try {
                                mediaMetadataRetriever2.extractMetadata(16);
                            } catch (Throwable th) {
                                try {
                                    gm0.V("y3m", "getVideoBitrate: failed", th);
                                } catch (RuntimeException e) {
                                    e = e;
                                    i2 = iB;
                                    j = jC;
                                    point3 = pointG;
                                    point2 = point3;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    point = point2;
                                    gm0.W("y3m", "getVideoParams: failed" + e, new Object[0]);
                                    h(mediaMetadataRetriever);
                                    point4 = point;
                                    i3 = i2;
                                }
                            }
                            h(mediaMetadataRetriever2);
                            i3 = iB;
                            j = jC;
                            point4 = pointG;
                        } catch (RuntimeException e2) {
                            e = e2;
                            j = jC;
                            i2 = 0;
                            point3 = pointG;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        bitmapCreateScaledBitmap = null;
                        j = 0;
                        i2 = 0;
                        point2 = null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        try {
                            int width = bitmapCreateScaledBitmap.getWidth();
                            int height = bitmapCreateScaledBitmap.getHeight();
                            int iMax = Math.max(width, height);
                            if (iMax > i) {
                                float f = (i * 1.0f) / iMax;
                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, Math.round(width * f), Math.round(f * height), true);
                            }
                        } catch (Throwable th2) {
                            gm0.V("y3m", "getVideoParams: failed to resize to thumbnail", th2);
                        }
                    }
                    if (point4 == 0) {
                        point4 = new Point(0, 0);
                    }
                    return new mf5(bitmapCreateScaledBitmap, j, (Point) point4, i3);
                } catch (Throwable th3) {
                    th = th3;
                    point4 = mediaMetadataRetriever2;
                    h(point4);
                    throw th;
                }
            } catch (RuntimeException e4) {
                e = e4;
                bitmapCreateScaledBitmap = null;
                j = 0;
                i2 = 0;
                point = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static Point f(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                Point pointG = g(mediaMetadataRetriever2);
                h(mediaMetadataRetriever2);
                return pointG;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    gm0.V("y3m", "getVideoSize from uri: failed", th);
                    return new Point(0, 0);
                } finally {
                    h(mediaMetadataRetriever);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Point g(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i == 90 || i == 270) {
                strExtractMetadata2 = strExtractMetadata;
                strExtractMetadata = strExtractMetadata2;
            }
            return new Point(Integer.parseInt(strExtractMetadata), Integer.parseInt(strExtractMetadata2));
        } catch (Throwable th) {
            gm0.V("y3m", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static void h(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever == null) {
            return;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused) {
        }
    }

    public static final fe8 i(int i) {
        byte b = (byte) i;
        if (b == 0) {
            return new de8((byte) 0);
        }
        if (b == 1) {
            return new be8((byte) 1);
        }
        return b == 2 ? new ce8((byte) 2) : new ee8(b);
    }
}
