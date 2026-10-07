package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wn9 {
    public static ClassLoader a;
    public static Thread b;
    public static final String[] c = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] d = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] e = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public wn9(View view) {
        Context context = view.getContext();
        e9i.v0(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        e9i.u0(R.attr.motionDurationMedium2, 300, context);
        e9i.u0(R.attr.motionDurationShort3, 150, context);
        e9i.u0(R.attr.motionDurationShort2, 100, context);
    }

    public static gj2 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!a05.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        a98 a98Var = c98.b;
        ghe gheVarB = ghe.e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (a05.f(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strA = a05.a(xmlPullParserNewPullParser, c[i2]);
                    if (strA != null) {
                        if (Integer.parseInt(strA) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strA2 = a05.a(xmlPullParserNewPullParser, d[i3]);
                                if (strA2 != null) {
                                    j = Long.parseLong(strA2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                a98 a98Var2 = c98.b;
                                gheVarB = ghe.e;
                                break;
                            }
                            String strA3 = a05.a(xmlPullParserNewPullParser, e[i]);
                            if (strA3 != null) {
                                gheVarB = c98.s(new m1b("image/jpeg", 0L, 0L), new m1b("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (a05.f(xmlPullParserNewPullParser, "Container:Directory")) {
                gheVarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (a05.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                gheVarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!a05.e(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (gheVarB.isEmpty()) {
            break loop0;
        }
        return new gj2(j, gheVarB, 6);
        return null;
    }

    public static ghe b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        z88 z88VarL = c98.l();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a05.f(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = a05.a(xmlPullParser, strConcat3);
                String strA2 = a05.a(xmlPullParser, strConcat4);
                String strA3 = a05.a(xmlPullParser, strConcat5);
                String strA4 = a05.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ghe.e;
                }
                z88VarL.c(new m1b(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!a05.e(xmlPullParser, strConcat2));
        return z88VarL.h();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader c() {
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        if (a == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        oxe oxeVar = new oxe(threadGroup, "GmsDynamite");
                                        try {
                                            oxeVar.setContextClassLoader(null);
                                            oxeVar.start();
                                            thread = oxeVar;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = oxeVar;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (SecurityException e6) {
                                e2 = e6;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                a = contextClassLoader;
            }
        }
        return a;
    }
}
