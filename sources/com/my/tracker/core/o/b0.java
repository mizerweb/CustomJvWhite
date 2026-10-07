package com.my.tracker.core.o;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    static long i = -1;
    private final SQLiteDatabase a;
    private final l0 b;
    private final m0 c;
    private final q0 d;
    private final r0 e;
    private final o0 f;
    private final p0 g;
    private final n0 h;

    private b0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.f = new o0(sQLiteDatabase);
        this.b = new l0(sQLiteDatabase);
        this.c = new m0(sQLiteDatabase);
        this.d = new q0(sQLiteDatabase);
        this.e = new r0(sQLiteDatabase);
        this.g = new p0(sQLiteDatabase);
        this.h = new n0(sQLiteDatabase);
    }

    public static b0 a(String str, Application application) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = application.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                Tracer.e("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 11) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                application.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = application.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(11);
                o0.a(sQLiteDatabaseOpenOrCreateDatabase);
                l0.a(sQLiteDatabaseOpenOrCreateDatabase);
                m0.a(sQLiteDatabaseOpenOrCreateDatabase);
                q0.a(sQLiteDatabaseOpenOrCreateDatabase);
                r0.a(sQLiteDatabaseOpenOrCreateDatabase);
                p0.a(sQLiteDatabaseOpenOrCreateDatabase);
                a(sQLiteDatabaseOpenOrCreateDatabase);
            }
            return new b0(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th) {
            Tracer.e("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    public long b(long j) {
        return this.c.a(j);
    }

    public long c(long j) {
        return this.b.a(j);
    }

    public p d(long j) {
        return this.c.b(j);
    }

    public long e(long j) {
        return this.e.a(j);
    }

    public o f() {
        return this.b.b();
    }

    public long g() {
        return this.b.c();
    }

    public SQLiteDatabase h() {
        return this.a;
    }

    public void i() {
        this.d.a();
    }

    public o b(long j, byte[] bArr) {
        return this.b.b(j, bArr);
    }

    public void c(long j, long j2) {
        this.c.b(j, j2);
    }

    public void d(long j, long j2) {
        this.b.a(j, j2);
    }

    public b e() {
        return this.g.a();
    }

    public g0 f(long j) {
        return this.e.b(j);
    }

    public void g(long j) {
        this.g.b(j);
    }

    public f0 b(String str) {
        return this.d.a(str);
    }

    public void c() {
        this.d.b();
    }

    public void d() {
        this.e.a();
    }

    public void b() {
        this.b.a();
    }

    public long b(long j, long j2) {
        return this.e.a(j, j2);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
    }

    public Long a(String str) {
        return this.f.a(str);
    }

    public long a(long j, byte[] bArr) {
        return this.b.a(j, bArr);
    }

    public long a(long j, int i2, boolean z, byte[] bArr) {
        return this.b.a(j, i2, z, bArr);
    }

    public long a(String str, long j) {
        return this.d.a(str, j);
    }

    public void a(long j, long j2, boolean z, long j3) {
        this.e.a(j, j2, z, j3);
    }

    public void a(long j, long j2, long j3) {
        this.d.a(j, j2, j3);
    }

    public void a(String str, Long l) {
        this.f.a(str, l);
    }

    public void a() {
        this.c.a();
    }

    public long a(long j, long j2) {
        return this.c.a(j, j2);
    }

    public void a(byte[] bArr) {
        this.g.a(bArr);
    }

    public void a(long j) {
        this.g.a(j);
    }
}
