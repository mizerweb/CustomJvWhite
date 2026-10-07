package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.database.Cursor;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Base64;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.zip.Adler32;
import one.me.transparent.TransparentActivity;
import one.video.upload.exceptions.InvalidHttpResponseException;
import org.apache.commons.logging.LogFactory;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public class kr6 implements sah, hu3, qf, p9b, v7h {
    public static final pg7[] d = {pg7.a, pg7.b, pg7.c, pg7.d, pg7.e, pg7.f, pg7.g, pg7.h, pg7.i, pg7.j};
    public Object a;
    public Object b;
    public Object c;

    public kr6(int i) {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        String strH = zo5.h(i << 3, "SHA-");
        try {
            this.a = MessageDigest.getInstance(strH);
        } catch (NoSuchAlgorithmException unused) {
            ore.q(c0a.o("Missing ", strH, " support"));
            throw null;
        }
    }

    public static ea5 A(gy9 gy9Var) {
        eb5 eb5Var = new eb5();
        eb5Var.b = null;
        Uri uri = gy9Var.b;
        ae7 ae7Var = new ae7(uri == null ? null : uri.toString(), gy9Var.f, eb5Var);
        pci it = gy9Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) ae7Var.d)) {
                ((HashMap) ae7Var.d).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = f71.a;
        l6m l6mVar = new l6m(22);
        UUID uuid2 = gy9Var.a;
        uuid2.getClass();
        boolean z = gy9Var.d;
        boolean z2 = gy9Var.e;
        int[] iArrH = k4m.h(gy9Var.g);
        for (int i : iArrH) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            lvb.R(z3);
        }
        ea5 ea5Var = new ea5(uuid2, ae7Var, map, z, (int[]) iArrH.clone(), z2, l6mVar);
        byte[] bArr = gy9Var.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        lvb.b0(ea5Var.m.isEmpty());
        ea5Var.v = bArrCopyOf;
        return ea5Var;
    }

    public static pg7 B(jfk jfkVar) {
        Object[] objArr = {jfk.certificate, jfk.certificate_verify, jfk.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (!Collections.unmodifiableList(arrayList).contains(jfkVar)) {
            return pg7.values()[jfkVar.ordinal()];
        }
        qr7.y(jfkVar, "cannot convert ambiguous type ");
        return null;
    }

    public static boolean C(Editable editable, KeyEvent keyEvent, boolean z) {
        m9i[] m9iVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (m9iVarArr = (m9i[]) editable.getSpans(selectionStart, selectionEnd, m9i.class)) != null && m9iVarArr.length > 0) {
                for (m9i m9iVar : m9iVarArr) {
                    int spanStart = editable.getSpanStart(m9iVar);
                    int spanEnd = editable.getSpanEnd(m9iVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean F(s46 s46Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                m9i[] m9iVarArr = (m9i[]) editable.getSpans(selectionStart, iMin, m9i.class);
                if (m9iVarArr != null && m9iVarArr.length > 0) {
                    for (m9i m9iVar : m9iVarArr) {
                        int spanStart = editable.getSpanStart(m9iVar);
                        int spanEnd = editable.getSpanEnd(m9iVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    s46Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    s46Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static pg7 f(jfk jfkVar, boolean z) {
        if (jfkVar == jfk.finished) {
            return z ? pg7.j : pg7.g;
        }
        if (jfkVar == jfk.certificate) {
            return z ? pg7.h : pg7.e;
        }
        if (jfkVar == jfk.certificate_verify) {
            return z ? pg7.i : pg7.f;
        }
        return pg7.values()[jfkVar.ordinal()];
    }

    public static boolean s(kr6 kr6Var, byte[] bArr) {
        byte[] bArr2 = (byte[]) kr6Var.a;
        return bArr2 != null && Arrays.equals(bArr2, bArr);
    }

    public static e89 t(kr6 kr6Var) {
        e89 e89Var = (e89) kr6Var.c;
        e89Var.getClass();
        return e89Var;
    }

    public static boolean u(kr6 kr6Var, Uri uri) {
        Uri uri2 = (Uri) kr6Var.b;
        return uri2 != null && uri2.equals(uri);
    }

    public static boolean v(kr6 kr6Var, b0a b0aVar) {
        Uri uri = (Uri) kr6Var.b;
        if (uri != null && uri.equals(b0aVar.m)) {
            return true;
        }
        byte[] bArr = (byte[]) kr6Var.a;
        return bArr != null && Arrays.equals(bArr, b0aVar.k);
    }

    public ev5 D(ry9 ry9Var) {
        ea5 ea5Var;
        ry9Var.b.getClass();
        gy9 gy9Var = ry9Var.b.c;
        if (gy9Var == null) {
            return ev5.a;
        }
        synchronized (this.a) {
            try {
                if (!gy9Var.equals((gy9) this.b)) {
                    this.b = gy9Var;
                    this.c = A(gy9Var);
                }
                ea5Var = (ea5) this.c;
                ea5Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ea5Var;
    }

    public ByteBuffer E() {
        AtomicLong atomicLong = (AtomicLong) this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < byteBuffer.capacity()) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet(-byteBuffer.remaining());
        }
        return byteBuffer;
    }

    public boolean G(CharSequence charSequence, int i, int i2, l9i l9iVar) {
        if ((l9iVar.c & 3) == 0) {
            va5 va5Var = (va5) this.c;
            swa swaVarB = l9iVar.b();
            int iA = swaVarB.a(8);
            if (iA != 0) {
                swaVarB.b.getShort(iA + swaVarB.a);
            }
            va5Var.getClass();
            ThreadLocal threadLocal = va5.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = va5Var.a;
            String string = sb.toString();
            int i3 = xlc.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = l9iVar.c & 4;
            l9iVar.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (l9iVar.c & 3) == 2;
    }

    public boolean H() {
        return ((ByteBuffer) this.b).hasRemaining() || ((AtomicLong) this.c).get() > 0;
    }

    public boolean I() throws InvalidHttpResponseException {
        int i;
        String line;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        boolean z = nec.a;
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        ds7 kziVar = z ? new kzi(new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()), this, false) : new xva(15, new BufferedReader(new InputStreamReader(new BufferedInputStream(new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit())))));
        String str = "";
        boolean z2 = true;
        while (true) {
            String line2 = kziVar.readLine();
            if (line2 != null) {
                str = line2;
            } else {
                line2 = null;
            }
            if (line2 == null) {
                break;
            }
            if (z2) {
                if (str.length() < 12) {
                    break;
                }
                if (!z5h.K0(str, "HTTP/", false)) {
                    throw z("Invalid HTTP response start", str, null);
                }
                int iU0 = r5h.U0(str, ' ', 4, 4);
                if (iU0 == -1 || str.length() <= (i = iU0 + 4)) {
                    break;
                }
                String strSubstring = str.substring(iU0 + 1, i);
                try {
                    this.a = Integer.valueOf(Integer.parseInt(strSubstring));
                    z2 = false;
                } catch (NumberFormatException e) {
                    throw z(c0a.o("Invalid HTTP response status code '", strSubstring, "'"), str, e);
                }
            } else if (str.length() > 0) {
                int iU1 = r5h.U0(str, ':', 0, 6);
                if (iU1 != -1) {
                    linkedHashMap.put(r5h.y1(r5h.u1(iU1, str)).toString(), r5h.y1(str.substring(iU1 + 1)).toString());
                }
            } else {
                String str2 = (String) linkedHashMap.get(HTTP.TRANSFER_ENCODING);
                String str3 = (String) linkedHashMap.get(HTTP.CONTENT_LEN);
                Long lC0 = str3 != null ? y5h.C0(str3) : null;
                if (lC0 == null) {
                    if (HTTP.CHUNK_CODING.equals(str2)) {
                        String line3 = kziVar.readLine();
                        if (line3 == null) {
                            break;
                        }
                        tre.M(16);
                        long j = Long.parseLong(line3, 16);
                        while (j > 0) {
                            if (j != kziVar.skip(j) || kziVar.readLine() == null || (line = kziVar.readLine()) == null) {
                                break;
                            }
                            tre.M(16);
                            j = Long.parseLong(line, 16);
                        }
                    }
                    return true;
                }
                if (kziVar.skip(lC0.longValue()) == lC0.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void J(m09 m09Var) {
        kjf kjfVar = (kjf) this.c;
        if (kjfVar != null) {
            kjfVar.run();
        }
        kjf kjfVar2 = new kjf((i19) this.a, m09Var);
        this.c = kjfVar2;
        ((Handler) this.b).postAtFrontOfQueue(kjfVar2);
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, c56 c56Var) {
        int i4;
        char c;
        d56 d56Var = new d56((ywa) ((ljf) this.b).d);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zN = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zN) {
                    SparseArray sparseArray = d56Var.c.a;
                    ywa ywaVar = sparseArray == null ? null : (ywa) sparseArray.get(iCodePointAt);
                    if (d56Var.a == 2) {
                        if (ywaVar != null) {
                            d56Var.c = ywaVar;
                            d56Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                d56Var.a();
                            } else if (iCodePointAt != 65039) {
                                ywa ywaVar2 = d56Var.c;
                                if (ywaVar2.b != null) {
                                    if (d56Var.f != 1) {
                                        d56Var.d = ywaVar2;
                                        d56Var.a();
                                    } else if (d56Var.b()) {
                                        d56Var.d = d56Var.c;
                                        d56Var.a();
                                    } else {
                                        d56Var.a();
                                    }
                                    c = 3;
                                } else {
                                    d56Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (ywaVar == null) {
                        d56Var.a();
                        c = 1;
                    } else {
                        d56Var.a = 2;
                        d56Var.c = ywaVar;
                        d56Var.f = 1;
                        c = 2;
                    }
                    d56Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && G(charSequence, i4, iCharCount, d56Var.d.b)) {
                            break;
                        }
                        zN = c56Var.n(charSequence, i4, iCharCount, d56Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (d56Var.a == 2 && d56Var.c.b != null && ((d56Var.f > 1 || d56Var.b()) && i5 < i3 && zN && (z || !G(charSequence, i4, iCharCount, d56Var.c.b)))) {
            c56Var.n(charSequence, i4, iCharCount, d56Var.c.b);
        }
        return c56Var.e();
    }

    public void L(pf pfVar) {
        z3d z3dVar = (z3d) ((HashMap) this.a).remove(pfVar);
        z3dVar.getClass();
        ndc ndcVar = (ndc) ((odc) this.c).k.get(z3dVar);
        if (ndcVar != null) {
            synchronized (ndcVar) {
                ndcVar.d--;
            }
        }
    }

    public void M(File file) throws IOException {
        Object poeVar;
        ju6 ju6Var = (ju6) this.b;
        Context context = (Context) this.a;
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        if (Build.VERSION.SDK_INT >= 34) {
            sessionParams.setPermissionState("android.permission.USE_FULL_SCREEN_INTENT", ((lsi) this.c).a() ? 1 : 0);
        }
        PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
        try {
            poeVar = context.getContentResolver().openInputStream(ju6Var.i(context, file));
            if (poeVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            try {
                poeVar = new FileInputStream(file);
            } catch (Throwable th2) {
                poeVar = new poe(th2);
            }
        }
        ch3.d0(poeVar);
        InputStream inputStream = (InputStream) poeVar;
        try {
            ju6Var.getClass();
            OutputStream outputStreamOpenWrite = sessionOpenSession.openWrite("MAX", 0L, 0L);
            try {
                byte[] bArr = new byte[65536];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    outputStreamOpenWrite.write(bArr, 0, i);
                }
                Bundle bundle = null;
                rx8.n(outputStreamOpenWrite, null);
                inputStream.close();
                Intent intent = new Intent(context, (Class<?>) TransparentActivity.class);
                intent.setAction(context.getApplicationInfo().packageName + ".INTERCEPT_LINK_ACTION");
                if (Build.VERSION.SDK_INT >= 34) {
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    activityOptionsMakeBasic.setPendingIntentCreatorBackgroundActivityStartMode(1);
                    bundle = activityOptionsMakeBasic.toBundle();
                }
                sessionOpenSession.commit(PendingIntent.getActivity(context, 0, intent, 33554432, bundle).getIntentSender());
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rx8.n(outputStreamOpenWrite, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                rx8.n(inputStream, th5);
                throw th6;
            }
        }
    }

    public void N(ij0 ij0Var, int i, boolean z) {
        si0 si0Var = (si0) this.c;
        Context context = (Context) this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ij0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        vhd vhdVar = ij0Var.c;
        adler32.update(byteBufferAllocate.putInt(yhd.a(vhdVar)).array());
        byte[] bArr = ij0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    e2k.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", ij0Var);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((uxe) this.b).l().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(yhd.a(vhdVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(si0Var.a(vhdVar, jLongValue, i));
            Set set = ((ti0) si0Var.b.get(vhdVar)).c;
            if (set.contains(b3f.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(b3f.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(b3f.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, yhd.a(vhdVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {ij0Var, Integer.valueOf(value), Long.valueOf(si0Var.a(vhdVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void O(File file) {
        Object poeVar;
        Object obj = sbi.a;
        try {
            M(file);
            poeVar = obj;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) == null) {
            obj = poeVar;
        } else {
            String str = sj8.a;
            Context context = (Context) this.a;
            Uri uriI = ((ju6) this.b).i(context, file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.addFlags(1);
            intent.setDataAndType(uriI, "application/vnd.android.package-archive");
            context.startActivity(intent);
        }
        Throwable thA = roe.a(obj);
        if (thA != null) {
            gm0.V(kr6.class.getName(), "fail", thA);
        }
    }

    @Override // defpackage.p9b
    public c98 a(int i) {
        return ((ba8) this.a).a(i);
    }

    @Override // defpackage.hu3
    public i95 b(b87 b87Var, Surface surface, boolean z, LogSessionId logSessionId) {
        i95 i95VarB = ((hu3) this.a).b(b87Var, surface, z, logSessionId);
        this.c = i95VarB.c();
        return i95VarB;
    }

    @Override // defpackage.p9b
    public q9b c(String str) {
        return new jvd((Long) this.b, ((ba8) this.a).c(str), (c5f) this.c);
    }

    @Override // defpackage.hu3
    public i95 d(b87 b87Var, LogSessionId logSessionId) {
        i95 i95VarD = ((hu3) this.a).d(b87Var, logSessionId);
        this.b = i95VarD.c();
        return i95VarD;
    }

    @Override // defpackage.v7h
    public int e(long j) {
        long[] jArr = (long[]) this.c;
        int iB = vqi.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.qf
    public synchronized pf g() {
        pf pfVarG;
        pfVarG = ((odc) this.c).c.g();
        ((HashMap) this.a).put(pfVarG, (z3d) this.b);
        ndc ndcVar = (ndc) ((odc) this.c).k.get((z3d) this.b);
        if (ndcVar != null) {
            synchronized (ndcVar) {
                ndcVar.d++;
            }
        }
        return pfVarG;
    }

    @Override // defpackage.sah
    public Object get() {
        xb0 xb0Var = (xb0) this.a;
        nwk.b(xb0Var);
        nwk.c(xb0Var);
        int i = xb0Var.a;
        gh0 gh0Var = (gh0) this.b;
        int i2 = gh0Var.e;
        if (i == -1) {
            tvj.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + i2);
            i = i2;
        } else {
            tvj.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + i2 + ", Resolved Channel Count: " + i + ']');
        }
        int i3 = gh0Var.d;
        kl2 kl2VarD = nwk.d(i3, i, 2, (Rational) this.c);
        int i4 = kl2VarD.b;
        int i5 = kl2VarD.a;
        StringBuilder sbP = qv1.p("Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: ", i5, "Hz. Encode sample rate: ", i4, "Hz. [AudioProfile sample rate: ");
        sbP.append(i3);
        sbP.append("Hz]");
        tvj.a("AudioSrcAdPrflRslvr", sbP.toString());
        List list = rg0.f;
        g85 g85Var = new g85();
        g85Var.a = -1;
        g85Var.b = -1;
        g85Var.c = -1;
        g85Var.d = -1;
        g85Var.e = -1;
        g85Var.a = 5;
        g85Var.e = 2;
        g85Var.d = Integer.valueOf(i);
        g85Var.b = Integer.valueOf(i5);
        g85Var.c = Integer.valueOf(i4);
        return g85Var.w();
    }

    @Override // defpackage.v7h
    public List h(long j) {
        List list = (List) this.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                suj sujVar = (suj) list.get(i);
                yy4 yy4Var = sujVar.a;
                if (yy4Var.e == -3.4028235E38f) {
                    arrayList2.add(sujVar);
                } else {
                    arrayList.add(yy4Var);
                }
            }
        }
        Collections.sort(arrayList2, new ps0(27));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            xy4 xy4VarA = ((suj) arrayList2.get(i3)).a.a();
            xy4VarA.e = (-1) - i3;
            xy4VarA.f = 1;
            arrayList.add(xy4VarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.qf
    public synchronized void i(n21 n21Var) {
        ((odc) this.c).c.i(n21Var);
        while (n21Var != null) {
            pf pfVar = (pf) n21Var.c;
            pfVar.getClass();
            L(pfVar);
            n21Var = n21Var.d();
        }
    }

    public eek j() throws IOException {
        PushbackInputStream pushbackInputStream = (PushbackInputStream) this.c;
        long jG = ti8.g(pushbackInputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        pushbackInputStream.unread(byteBufferAllocate.array(), 0, ti8.c(jG, byteBufferAllocate));
        HashMap map = (HashMap) this.b;
        if (map.containsKey(Long.valueOf(jG))) {
            try {
                return (eek) ((Function) map.get(Long.valueOf(jG))).apply(pushbackInputStream);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        long jG2 = ti8.g(pushbackInputStream);
        int iG = (int) ti8.g(pushbackInputStream);
        ((oek) this.a).c.read(new byte[iG]);
        fek fekVar = new fek();
        fekVar.a = jG2;
        fekVar.b = iG;
        return fekVar;
    }

    @Override // defpackage.qf
    public synchronized void k(pf pfVar) {
        ((odc) this.c).c.k(pfVar);
        L(pfVar);
    }

    @Override // defpackage.qf
    public synchronized void l() {
        ((odc) this.c).c.l();
    }

    @Override // defpackage.v7h
    public long m(int i) {
        long[] jArr = (long[]) this.c;
        lvb.R(i >= 0);
        lvb.R(i < jArr.length);
        return jArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, String str2, nq4 nq4Var) {
        djk djkVar;
        if (nq4Var instanceof djk) {
            djkVar = (djk) nq4Var;
            int i = djkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                djkVar.f = i - Integer.MIN_VALUE;
            } else {
                djkVar = new djk(this, nq4Var);
            }
        } else {
            djkVar = new djk(this, nq4Var);
        }
        Object objK0 = djkVar.d;
        int i2 = djkVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            lb5 lb5Var = (lb5) this.c;
            ejk ejkVar = new ejk(str, str2, this, null, 0);
            djkVar.f = 1;
            objK0 = yab.K0(lb5Var, ejkVar, djkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    @Override // defpackage.v7h
    public int o() {
        return ((long[]) this.c).length;
    }

    public void p(p5k p5kVar) {
        Object[] objArr = {jfk.certificate, jfk.certificate_verify, jfk.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (Collections.unmodifiableList(arrayList).contains(p5kVar.b())) {
            ore.a();
        } else {
            ((ConcurrentHashMap) this.b).put(B(p5kVar.b()), p5kVar.d());
        }
    }

    @Override // defpackage.qf
    public synchronized int q() {
        return ((odc) this.c).c.b;
    }

    public byte[] r(pg7 pg7Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        if (!concurrentHashMap.containsKey(pg7Var)) {
            MessageDigest messageDigest = (MessageDigest) this.a;
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.b;
            for (int i = 0; i < 10; i++) {
                pg7 pg7Var2 = d[i];
                if (concurrentHashMap2.containsKey(pg7Var2)) {
                    messageDigest.update((byte[]) concurrentHashMap2.get(pg7Var2));
                }
                if (pg7Var2 == pg7Var) {
                    break;
                }
            }
            concurrentHashMap.put(pg7Var, messageDigest.digest());
        }
        return (byte[]) concurrentHashMap.get(pg7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(String str, String str2, nq4 nq4Var) {
        fjk fjkVar;
        if (nq4Var instanceof fjk) {
            fjkVar = (fjk) nq4Var;
            int i = fjkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjkVar.f = i - Integer.MIN_VALUE;
            } else {
                fjkVar = new fjk(this, nq4Var);
            }
        } else {
            fjkVar = new fjk(this, nq4Var);
        }
        Object objK0 = fjkVar.d;
        int i2 = fjkVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            lb5 lb5Var = (lb5) this.c;
            ejk ejkVar = new ejk(str, str2, this, null, 1);
            fjkVar.f = 1;
            objK0 = yab.K0(lb5Var, ejkVar, fjkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    public void x(p5k p5kVar) {
        ((ConcurrentHashMap) this.b).put(f(p5kVar.b(), true), p5kVar.d());
    }

    public void y(p5k p5kVar) {
        ((ConcurrentHashMap) this.b).put(f(p5kVar.b(), false), p5kVar.d());
    }

    public InvalidHttpResponseException z(String str, String str2, NumberFormatException numberFormatException) {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        return new InvalidHttpResponseException(str + ". line: '" + str2 + "' response '" + new String(byteBuffer.array(), 0, byteBuffer.position(), pt2.a) + "'", numberFormatException);
    }

    public kr6(pve pveVar) {
        this.b = null;
        this.c = null;
        this.a = pveVar;
    }

    public kr6(cb0 cb0Var) {
        this.a = cb0Var;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(cb0Var.d * 1024).order(ByteOrder.nativeOrder());
        this.b = byteBufferOrder;
        byteBufferOrder.flip();
        this.c = new AtomicLong();
    }

    public kr6(int i, boolean z) {
        switch (i) {
            case 9:
                this.b = new LinkedHashMap();
                this.c = ByteBuffer.allocate(8096);
                break;
            default:
                this.a = new Object();
                break;
        }
    }

    public /* synthetic */ kr6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public kr6(byte[] bArr, e89 e89Var) {
        this.a = bArr;
        this.b = null;
        this.c = e89Var;
    }

    public kr6(Uri uri, e89 e89Var) {
        this.a = null;
        this.b = uri;
        this.c = e89Var;
    }

    public kr6(b0a b0aVar, e89 e89Var) {
        this.a = b0aVar.k;
        this.b = b0aVar.m;
        this.c = e89Var;
    }

    public kr6(odc odcVar, z3d z3dVar) {
        this.c = odcVar;
        this.a = new HashMap();
        this.b = z3dVar;
    }
}
