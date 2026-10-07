package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class uy0 {
    public static ThreadPoolExecutor A;
    public static int B;
    public static ed7 C;
    public static boolean w;
    public static final ConcurrentHashMap x = new ConcurrentHashMap();
    public static volatile boolean y;
    public static final int z;
    public final sy0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final pi p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public RandomAccessFile u;
    public BitmapFactory.Options v;

    static {
        abb abbVar = cqk.e;
        z = Math.max(Math.min(abbVar.h - 2, abbVar.i), 1);
    }

    public uy0(File file, sy0 sy0Var, ry0 ry0Var, int i, int i2, boolean z2) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new pi(5, this);
        this.a = sy0Var;
        this.b = i;
        this.c = i2;
        ry0Var.getClass();
        this.l = 100;
        String name = file.getName();
        if (A == null) {
            int i3 = z;
            A = new ThreadPoolExecutor(i3, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(cqk.e.g.a(), "acache");
        if (!w) {
            file2.mkdir();
            w = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        File file3 = new File(file2, zo5.w(sb, z2 ? "_nolimit" : " ", ".pcache2"));
        this.m = file3;
        this.f = i < di.a(60.0f) && i2 < di.a(60.0f);
        if (!((Boolean) cqk.e.k.invoke()).booleanValue()) {
            this.k = false;
            this.s = false;
            return;
        }
        this.k = file3.exists();
        if (this.k) {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file3, "r");
                    try {
                        this.s = randomAccessFile.readBoolean();
                        if (this.s && arrayList.isEmpty()) {
                            randomAccessFile.seek(randomAccessFile.readInt());
                            int i4 = randomAccessFile.readInt();
                            d(randomAccessFile, i4 > 10000 ? 0 : i4);
                            if (arrayList.size() == 0) {
                                this.s = false;
                                this.k = false;
                                this.q = true;
                                file3.delete();
                            } else {
                                if (this.u != randomAccessFile) {
                                    a();
                                }
                                this.u = randomAccessFile;
                            }
                        }
                        if (this.u != randomAccessFile) {
                            randomAccessFile.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            this.m.delete();
                            this.k = false;
                            this.q = true;
                            if (this.u != randomAccessFile && randomAccessFile != null) {
                            }
                            this.q = true;
                        } catch (Throwable th3) {
                            try {
                                if (this.u == randomAccessFile || randomAccessFile == null) {
                                    throw th3;
                                }
                                randomAccessFile.close();
                                throw th3;
                            } catch (IOException e) {
                                e.printStackTrace();
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    randomAccessFile = null;
                    th = th4;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        this.q = true;
    }

    public static void c() {
        int i = B - 1;
        B = i;
        if (i <= 0) {
            B = 0;
            RLottieDrawable.lottieCacheGenerateQueue.b(new ff(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.u;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba A[ADDED_TO_REGION, EDGE_INSN: B:142:0x01ba->B:94:0x01ba BREAK  A[LOOP:0: B:47:0x00d0->B:93:0x01b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TRY_LEAVE, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0131 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, LOOP:2: B:75:0x012b->B:77:0x0131, LOOP_END, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0197 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ca A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TRY_LEAVE, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0099, B:46:0x00a0, B:47:0x00d0, B:49:0x00d4, B:53:0x00dc, B:55:0x00e4, B:58:0x00ec, B:61:0x00f9, B:63:0x00fd, B:65:0x0101, B:69:0x0109, B:68:0x0106, B:70:0x010c, B:71:0x011d, B:73:0x0120, B:74:0x0121, B:75:0x012b, B:77:0x0131, B:78:0x014e, B:79:0x015b, B:81:0x015e, B:82:0x015f, B:86:0x0193, B:89:0x0196, B:90:0x0197, B:93:0x01b1, B:94:0x01ba, B:95:0x01c6, B:97:0x01ca, B:99:0x01ce, B:103:0x01d6, B:102:0x01d3, B:107:0x01e0, B:52:0x00d9), top: B:139:0x0004, outer: #12 }] */
    public final void b() {
        final RandomAccessFile randomAccessFile;
        char c;
        final Bitmap[] bitmapArr;
        final p88[] p88VarArr;
        final CountDownLatch[] countDownLatchArr;
        final ArrayList arrayList;
        final AtomicBoolean atomicBoolean;
        final int i;
        final int i2;
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        Bitmap bitmap;
        char c2;
        int i3;
        p88 p88Var;
        int i4;
        p88 p88Var2;
        CountDownLatch countDownLatch3;
        try {
            try {
                if (this.m.exists()) {
                    RandomAccessFile randomAccessFile2 = null;
                    try {
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.m, "r");
                            try {
                                this.s = randomAccessFile3.readBoolean();
                                if (this.s) {
                                    this.e.clear();
                                    randomAccessFile3.seek(randomAccessFile3.readInt());
                                    int i5 = randomAccessFile3.readInt();
                                    if (i5 > 10000) {
                                        i5 = 0;
                                    }
                                    if (i5 > 0) {
                                        d(randomAccessFile3, i5);
                                        randomAccessFile3.seek(0L);
                                        if (this.u != randomAccessFile3) {
                                            a();
                                        }
                                        this.u = randomAccessFile3;
                                        this.k = true;
                                        this.q = true;
                                        if (this.u != randomAccessFile3) {
                                            try {
                                                randomAccessFile3.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } else {
                                        this.k = false;
                                        this.s = false;
                                        this.q = true;
                                    }
                                }
                                if (!this.s) {
                                    this.m.delete();
                                }
                                if (this.u != randomAccessFile3) {
                                    randomAccessFile3.close();
                                }
                                while (true) {
                                    countDownLatch = countDownLatchArr[i];
                                    if (countDownLatch != null) {
                                        try {
                                            countDownLatch.await();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    if (!this.o.get() || atomicBoolean.get()) {
                                        break;
                                        break;
                                    }
                                    c2 = c;
                                    if (this.a.getNextFrame(bitmapArr[i]) != 1) {
                                        for (i3 = 0; i3 < z; i3++) {
                                            countDownLatch3 = countDownLatchArr[i3];
                                            if (countDownLatch3 != null) {
                                                try {
                                                    countDownLatch3.await();
                                                } catch (InterruptedException e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                        int length = (int) randomAccessFile.length();
                                        Collections.sort(arrayList, new lv5(9));
                                        p88Var = p88VarArr[0];
                                        synchronized (p88Var) {
                                            p88Var.b = 0;
                                        }
                                        int size = arrayList.size();
                                        p88VarArr[0].g(size);
                                        for (i4 = 0; i4 < arrayList.size(); i4++) {
                                            p88VarArr[0].g(((ty0) arrayList.get(i4)).c);
                                            p88VarArr[0].g(((ty0) arrayList.get(i4)).b);
                                        }
                                        randomAccessFile.write(p88VarArr[0].a, 0, (size * 8) + 4);
                                        p88Var2 = p88VarArr[0];
                                        synchronized (p88Var2) {
                                            p88Var2.b = 0;
                                        }
                                        randomAccessFile.seek(0L);
                                        randomAccessFile.writeBoolean(true);
                                        randomAccessFile.writeInt(length);
                                        atomicBoolean.set(true);
                                        randomAccessFile.close();
                                        this.e.clear();
                                        this.e.addAll(arrayList);
                                        a();
                                        this.u = new RandomAccessFile(this.m, "r");
                                        this.s = true;
                                        this.k = true;
                                        this.q = true;
                                        this.a.releaseForGenerateCache();
                                        return;
                                    }
                                    countDownLatchArr[i] = new CountDownLatch(1);
                                    A.execute(new Runnable() { // from class: py0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            uy0 uy0Var = this.a;
                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                            Bitmap[] bitmapArr2 = bitmapArr;
                                            int i6 = i;
                                            p88[] p88VarArr2 = p88VarArr;
                                            int i7 = i2;
                                            RandomAccessFile randomAccessFile4 = randomAccessFile;
                                            ArrayList arrayList2 = arrayList;
                                            CountDownLatch[] countDownLatchArr2 = countDownLatchArr;
                                            if (uy0Var.o.get() || atomicBoolean2.get()) {
                                                return;
                                            }
                                            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                                            if (Build.VERSION.SDK_INT <= 28) {
                                                compressFormat = Bitmap.CompressFormat.PNG;
                                            }
                                            bitmapArr2[i6].compress(compressFormat, uy0Var.l, p88VarArr2[i6]);
                                            int i8 = p88VarArr2[i6].b;
                                            try {
                                                synchronized (uy0Var.h) {
                                                    ty0 ty0Var = new ty0(i7);
                                                    ty0Var.c = (int) randomAccessFile4.length();
                                                    arrayList2.add(ty0Var);
                                                    randomAccessFile4.write(p88VarArr2[i6].a, 0, i8);
                                                    ty0Var.b = i8;
                                                    p88 p88Var3 = p88VarArr2[i6];
                                                    synchronized (p88Var3) {
                                                        p88Var3.b = 0;
                                                    }
                                                }
                                            } catch (IOException e3) {
                                                e3.printStackTrace();
                                                try {
                                                    randomAccessFile4.close();
                                                } catch (Exception unused2) {
                                                } finally {
                                                    atomicBoolean2.set(true);
                                                }
                                            }
                                            countDownLatchArr2[i6].countDown();
                                        }
                                    });
                                    i++;
                                    i2++;
                                    if (i >= z) {
                                        i = 0;
                                    }
                                    this.d.set(i2);
                                    c = c2;
                                }
                            } catch (Throwable unused2) {
                                randomAccessFile2 = randomAccessFile3;
                                try {
                                    this.m.delete();
                                    while (true) {
                                        countDownLatch = countDownLatchArr[i];
                                        if (countDownLatch != null) {
                                            countDownLatch.await();
                                        }
                                        if (!this.o.get()) {
                                            break;
                                        }
                                        c2 = c;
                                        if (this.a.getNextFrame(bitmapArr[i]) != 1) {
                                            while (i3 < z) {
                                                countDownLatch3 = countDownLatchArr[i3];
                                                if (countDownLatch3 != null) {
                                                    countDownLatch3.await();
                                                }
                                            }
                                            int length2 = (int) randomAccessFile.length();
                                            Collections.sort(arrayList, new lv5(9));
                                            p88Var = p88VarArr[0];
                                            synchronized (p88Var) {
                                                p88Var.b = 0;
                                                int size2 = arrayList.size();
                                                p88VarArr[0].g(size2);
                                                while (i4 < arrayList.size()) {
                                                    p88VarArr[0].g(((ty0) arrayList.get(i4)).c);
                                                    p88VarArr[0].g(((ty0) arrayList.get(i4)).b);
                                                }
                                                randomAccessFile.write(p88VarArr[0].a, 0, (size2 * 8) + 4);
                                                p88Var2 = p88VarArr[0];
                                                synchronized (p88Var2) {
                                                    p88Var2.b = 0;
                                                    randomAccessFile.seek(0L);
                                                    randomAccessFile.writeBoolean(true);
                                                    randomAccessFile.writeInt(length2);
                                                    atomicBoolean.set(true);
                                                    randomAccessFile.close();
                                                    this.e.clear();
                                                    this.e.addAll(arrayList);
                                                    a();
                                                    this.u = new RandomAccessFile(this.m, "r");
                                                    this.s = true;
                                                    this.k = true;
                                                    this.q = true;
                                                    this.a.releaseForGenerateCache();
                                                    return;
                                                }
                                            }
                                        }
                                        countDownLatchArr[i] = new CountDownLatch(1);
                                        A.execute(new Runnable() { // from class: py0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                uy0 uy0Var = this.a;
                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                Bitmap[] bitmapArr2 = bitmapArr;
                                                int i6 = i;
                                                p88[] p88VarArr2 = p88VarArr;
                                                int i7 = i2;
                                                RandomAccessFile randomAccessFile4 = randomAccessFile;
                                                ArrayList arrayList2 = arrayList;
                                                CountDownLatch[] countDownLatchArr2 = countDownLatchArr;
                                                if (uy0Var.o.get() || atomicBoolean2.get()) {
                                                    return;
                                                }
                                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                                                if (Build.VERSION.SDK_INT <= 28) {
                                                    compressFormat = Bitmap.CompressFormat.PNG;
                                                }
                                                bitmapArr2[i6].compress(compressFormat, uy0Var.l, p88VarArr2[i6]);
                                                int i8 = p88VarArr2[i6].b;
                                                try {
                                                    synchronized (uy0Var.h) {
                                                        ty0 ty0Var = new ty0(i7);
                                                        ty0Var.c = (int) randomAccessFile4.length();
                                                        arrayList2.add(ty0Var);
                                                        randomAccessFile4.write(p88VarArr2[i6].a, 0, i8);
                                                        ty0Var.b = i8;
                                                        p88 p88Var3 = p88VarArr2[i6];
                                                        synchronized (p88Var3) {
                                                            p88Var3.b = 0;
                                                        }
                                                    }
                                                } catch (IOException e3) {
                                                    e3.printStackTrace();
                                                    try {
                                                        randomAccessFile4.close();
                                                    } catch (Exception unused3) {
                                                    } finally {
                                                        atomicBoolean2.set(true);
                                                    }
                                                }
                                                countDownLatchArr2[i6].countDown();
                                            }
                                        });
                                        i++;
                                        i2++;
                                        if (i >= z) {
                                            i = 0;
                                        }
                                        this.d.set(i2);
                                        c = c2;
                                    }
                                } catch (Throwable unused3) {
                                }
                                if (this.u != randomAccessFile2 && randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                randomAccessFile = new RandomAccessFile(this.m, "rw");
                                c = 4;
                                if (C == null) {
                                    C = new ed7(4);
                                }
                                C.v(this.c, this.b);
                                ed7 ed7Var = C;
                                bitmapArr = (Bitmap[]) ed7Var.d;
                                p88VarArr = (p88[]) ed7Var.c;
                                countDownLatchArr = new CountDownLatch[z];
                                arrayList = new ArrayList();
                                randomAccessFile.writeBoolean(false);
                                randomAccessFile.writeInt(0);
                                atomicBoolean = new AtomicBoolean(false);
                                this.a.prepareForGenerateCache();
                                i = 0;
                                i2 = 0;
                                RLottie.getLogger().l("cancelled cache generation");
                                atomicBoolean.set(true);
                                for (int i6 = 0; i6 < z; i6++) {
                                    countDownLatch2 = countDownLatchArr[i6];
                                    if (countDownLatch2 != null) {
                                        try {
                                            countDownLatch2.await();
                                        } catch (InterruptedException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    bitmap = bitmapArr[i6];
                                    if (bitmap != null) {
                                        try {
                                            bitmap.recycle();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                }
                                randomAccessFile.close();
                                this.a.releaseForGenerateCache();
                                this.a.releaseForGenerateCache();
                            }
                        } catch (Throwable unused5) {
                        }
                    } catch (Throwable unused6) {
                    }
                    randomAccessFile = new RandomAccessFile(this.m, "rw");
                    c = 4;
                    if (C == null) {
                        C = new ed7(4);
                    }
                    C.v(this.c, this.b);
                    ed7 ed7Var2 = C;
                    bitmapArr = (Bitmap[]) ed7Var2.d;
                    p88VarArr = (p88[]) ed7Var2.c;
                    countDownLatchArr = new CountDownLatch[z];
                    arrayList = new ArrayList();
                    randomAccessFile.writeBoolean(false);
                    randomAccessFile.writeInt(0);
                    atomicBoolean = new AtomicBoolean(false);
                    this.a.prepareForGenerateCache();
                    i = 0;
                    i2 = 0;
                    RLottie.getLogger().l("cancelled cache generation");
                    atomicBoolean.set(true);
                    while (i6 < z) {
                        countDownLatch2 = countDownLatchArr[i6];
                        if (countDownLatch2 != null) {
                            countDownLatch2.await();
                        }
                        bitmap = bitmapArr[i6];
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                    randomAccessFile.close();
                    this.a.releaseForGenerateCache();
                } else {
                    randomAccessFile = new RandomAccessFile(this.m, "rw");
                    c = 4;
                    if (C == null) {
                        C = new ed7(4);
                    }
                    C.v(this.c, this.b);
                    ed7 ed7Var3 = C;
                    bitmapArr = (Bitmap[]) ed7Var3.d;
                    p88VarArr = (p88[]) ed7Var3.c;
                    countDownLatchArr = new CountDownLatch[z];
                    arrayList = new ArrayList();
                    randomAccessFile.writeBoolean(false);
                    randomAccessFile.writeInt(0);
                    atomicBoolean = new AtomicBoolean(false);
                    this.a.prepareForGenerateCache();
                    i = 0;
                    i2 = 0;
                    while (true) {
                        countDownLatch = countDownLatchArr[i];
                        if (countDownLatch != null) {
                            countDownLatch.await();
                        }
                        if (!this.o.get()) {
                            break;
                            break;
                        }
                        c2 = c;
                        if (this.a.getNextFrame(bitmapArr[i]) != 1) {
                            while (i3 < z) {
                                countDownLatch3 = countDownLatchArr[i3];
                                if (countDownLatch3 != null) {
                                    countDownLatch3.await();
                                }
                            }
                            int length3 = (int) randomAccessFile.length();
                            Collections.sort(arrayList, new lv5(9));
                            p88Var = p88VarArr[0];
                            synchronized (p88Var) {
                                p88Var.b = 0;
                                int size3 = arrayList.size();
                                p88VarArr[0].g(size3);
                                while (i4 < arrayList.size()) {
                                    p88VarArr[0].g(((ty0) arrayList.get(i4)).c);
                                    p88VarArr[0].g(((ty0) arrayList.get(i4)).b);
                                }
                                randomAccessFile.write(p88VarArr[0].a, 0, (size3 * 8) + 4);
                                p88Var2 = p88VarArr[0];
                                synchronized (p88Var2) {
                                    p88Var2.b = 0;
                                    randomAccessFile.seek(0L);
                                    randomAccessFile.writeBoolean(true);
                                    randomAccessFile.writeInt(length3);
                                    atomicBoolean.set(true);
                                    randomAccessFile.close();
                                    this.e.clear();
                                    this.e.addAll(arrayList);
                                    a();
                                    this.u = new RandomAccessFile(this.m, "r");
                                    this.s = true;
                                    this.k = true;
                                    this.q = true;
                                    this.a.releaseForGenerateCache();
                                    return;
                                }
                            }
                        }
                        countDownLatchArr[i] = new CountDownLatch(1);
                        A.execute(new Runnable() { // from class: py0
                            @Override // java.lang.Runnable
                            public final void run() {
                                uy0 uy0Var = this.a;
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                Bitmap[] bitmapArr2 = bitmapArr;
                                int i7 = i;
                                p88[] p88VarArr2 = p88VarArr;
                                int i8 = i2;
                                RandomAccessFile randomAccessFile4 = randomAccessFile;
                                ArrayList arrayList2 = arrayList;
                                CountDownLatch[] countDownLatchArr2 = countDownLatchArr;
                                if (uy0Var.o.get() || atomicBoolean2.get()) {
                                    return;
                                }
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                                if (Build.VERSION.SDK_INT <= 28) {
                                    compressFormat = Bitmap.CompressFormat.PNG;
                                }
                                bitmapArr2[i7].compress(compressFormat, uy0Var.l, p88VarArr2[i7]);
                                int i9 = p88VarArr2[i7].b;
                                try {
                                    synchronized (uy0Var.h) {
                                        ty0 ty0Var = new ty0(i8);
                                        ty0Var.c = (int) randomAccessFile4.length();
                                        arrayList2.add(ty0Var);
                                        randomAccessFile4.write(p88VarArr2[i7].a, 0, i9);
                                        ty0Var.b = i9;
                                        p88 p88Var3 = p88VarArr2[i7];
                                        synchronized (p88Var3) {
                                            p88Var3.b = 0;
                                        }
                                    }
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    try {
                                        randomAccessFile4.close();
                                    } catch (Exception unused7) {
                                    } finally {
                                        atomicBoolean2.set(true);
                                    }
                                }
                                countDownLatchArr2[i7].countDown();
                            }
                        });
                        i++;
                        i2++;
                        if (i >= z) {
                            i = 0;
                        }
                        this.d.set(i2);
                        c = c2;
                    }
                    RLottie.getLogger().l("cancelled cache generation");
                    atomicBoolean.set(true);
                    while (i6 < z) {
                        countDownLatch2 = countDownLatchArr[i6];
                        if (countDownLatch2 != null) {
                            countDownLatch2.await();
                        }
                        bitmap = bitmapArr[i6];
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                    randomAccessFile.close();
                    this.a.releaseForGenerateCache();
                }
                this.a.releaseForGenerateCache();
            } catch (FileNotFoundException e4) {
                RLottie.getLogger().h(e4);
                e4.printStackTrace();
            } catch (IOException e5) {
                RLottie.getLogger().h(e5);
            }
        } catch (Throwable th) {
            this.a.releaseForGenerateCache();
            throw th;
        }
    }

    public final void d(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i == 0) {
            return;
        }
        byte[] bArr = new byte[i * 8];
        randomAccessFile.read(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            ty0 ty0Var = new ty0(i2);
            ty0Var.c = byteBufferWrap.getInt();
            ty0Var.b = byteBufferWrap.getInt();
            this.e.add(ty0Var);
        }
    }

    public final byte[] e(ty0 ty0Var) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("rlottie-bg-pool");
        byte[] bArr = z2 ? (byte[]) x.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= ty0Var.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (ty0Var.b * 1.3f)];
        if (!z2) {
            this.g = bArr2;
            return bArr2;
        }
        x.put(Thread.currentThread(), bArr2);
        if (!y) {
            y = true;
            di.e(this.p, 5000L);
        }
        return bArr2;
    }

    public final int f(Bitmap bitmap, int i) {
        RandomAccessFile randomAccessFile;
        if (!this.j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.s || this.k) {
                    if (!this.s || (randomAccessFile = this.u) == null) {
                        randomAccessFile = new RandomAccessFile(this.m, "r");
                        try {
                            this.s = randomAccessFile.readBoolean();
                            if (this.s && this.e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.e.size() == 0) {
                                this.s = false;
                                this.q = true;
                            }
                            if (!this.s) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null && randomAccessFile2 != this.u) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            RLottie.getLogger().h(th);
                            int i2 = this.n + 1;
                            this.n = i2;
                            if (i2 > 10) {
                                this.j = true;
                            }
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                        }
                    }
                    if (this.e.size() != 0) {
                        ty0 ty0Var = (ty0) this.e.get(Math.max(Math.min(i, this.e.size() - 1), 0));
                        randomAccessFile.seek(ty0Var.c);
                        byte[] bArrE = e(ty0Var);
                        randomAccessFile.readFully(bArrE, 0, ty0Var.b);
                        if (this.t) {
                            this.u = null;
                            randomAccessFile.close();
                        } else {
                            if (this.u != randomAccessFile) {
                                a();
                            }
                            this.u = randomAccessFile;
                        }
                        if (this.v == null) {
                            this.v = new BitmapFactory.Options();
                        }
                        BitmapFactory.Options options = this.v;
                        options.inBitmap = bitmap;
                        BitmapFactory.decodeByteArray(bArrE, 0, ty0Var.b, options);
                        this.v.inBitmap = null;
                        return 0;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.s && this.k) ? false : true;
    }
}
