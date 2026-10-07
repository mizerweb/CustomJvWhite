package com.my.tracker.core.o;

import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    private final b0 a;
    private final int b;
    private final int c;
    private final int d;
    private long e;
    private long f;

    public d0(b0 b0Var, int i, int i2, int i3) {
        this.a = b0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        Long lA = b0Var.a("timestamp_base");
        if (lA == null) {
            this.e = 0L;
        } else {
            this.e = lA.longValue();
        }
        this.f = b0Var.g();
    }

    public boolean a(long j, int i, boolean z, boolean z2, long j2, byte[] bArr) {
        boolean z3;
        long j3;
        long jB;
        if (j == 24) {
            try {
                z3 = false;
                j3 = 0;
                if (this.a.c(j) >= this.c) {
                    try {
                        if (this.a.a(j, bArr) == 0) {
                            Tracer.d("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                            return false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Tracer.e("MyTrackerRepository error: event insertion failed, type: " + j, th);
                        return z3;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
                Tracer.e("MyTrackerRepository error: event insertion failed, type: " + j, th);
                return z3;
            }
        } else {
            z3 = false;
            j3 = 0;
        }
        long jA = b0.i;
        if (z2) {
            o oVarB = this.a.b(j, bArr);
            try {
                if (oVarB.moveToNext()) {
                    jA = oVarB.a();
                    jB = oVarB.b();
                } else {
                    jB = j3;
                }
                oVarB.close();
            } catch (Throwable th3) {
                if (oVarB == null) {
                    throw th3;
                }
                try {
                    oVarB.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            jB = j3;
        }
        if (jA == b0.i) {
            Tracer.d("MyTrackerRepository: insert " + j + " event");
            jA = this.a.a(j, i, z, bArr);
            if (jA != b0.i && z) {
                this.f++;
            }
        } else {
            Tracer.d("MyTrackerRepository: aggregate " + j + " event");
        }
        if (jA == b0.i) {
            Tracer.e("MyTrackerRepository error: event insertion failed, type: " + j);
            return z3;
        }
        if (this.e == j3) {
            b(j2);
        }
        this.a.c(jA, j2 - this.e);
        long jB2 = this.a.b(jA);
        Tracer.d("MyTrackerRepository: event timestamps count: " + jB2);
        long j4 = (long) this.b;
        if (jB2 <= j4) {
            return true;
        }
        long jA2 = this.a.a(jA, jB2 - j4);
        this.a.d(jA, jB + jA2);
        Tracer.d("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA2);
        return true;
    }

    public void b(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.e = j;
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: ", th);
        }
    }

    public j0 c() {
        return new k0(this.a, "default_session");
    }

    public b d() {
        try {
            return this.a.e();
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public long e() {
        try {
            Long lA = this.a.a("custom_events_skipped_count");
            if (lA == null) {
                return 0L;
            }
            return lA.longValue();
        } catch (Throwable th) {
            Tracer.e("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public boolean h() {
        ?? MoveToNext;
        try {
            o oVarF = this.a.f();
            try {
                MoveToNext = oVarF.moveToNext();
                try {
                    oVarF.close();
                    f0 f0VarB = this.a.b("default_session");
                    try {
                        MoveToNext = MoveToNext;
                        if (f0VarB.moveToNext()) {
                            MoveToNext++;
                        }
                        f0VarB.close();
                        return MoveToNext != 0;
                    } catch (Throwable th) {
                        if (f0VarB != null) {
                            try {
                                f0VarB.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                if (oVarF != null) {
                    try {
                        oVarF.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Exception unused2) {
            MoveToNext = 0;
        }
    }

    public h0 b() {
        return new i0(this.a);
    }

    public boolean a(long j, long j2) {
        boolean zMoveToNext;
        f0 f0Var;
        try {
            try {
                f0 f0VarB = this.a.b("default_session");
                try {
                    zMoveToNext = f0VarB.moveToNext();
                    long jB = 0;
                    try {
                        if (zMoveToNext) {
                            long jA = f0VarB.a();
                            long jF = f0VarB.f();
                            long jB2 = f0VarB.b();
                            f0Var = f0VarB;
                            if (this.e == 0) {
                                b(jF);
                            }
                            Tracer.d("MyTrackerRepository: finish previous session");
                            b0 b0Var = this.a;
                            if (j2 == 0) {
                                b0Var.a(jA, jF - this.e, true, 0L);
                            } else {
                                long j3 = this.e;
                                b0Var.a(jA, jF - j3, false, j2 - j3);
                            }
                            long jE = this.a.e(jA);
                            Tracer.d("MyTrackerRepository: session timestamps count: " + jE);
                            long j4 = (long) this.d;
                            if (jE > j4) {
                                jB = this.a.b(jA, jE - j4);
                                Tracer.d("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB);
                            }
                            Tracer.d("MyTrackerRepository: start new session");
                            this.a.a(jA, j, jB2 + jB);
                        } else {
                            f0Var = f0VarB;
                            Tracer.d("MyTrackerRepository: insert session");
                            if (this.a.a("default_session", j) == b0.i) {
                                Tracer.e("MyTrackerRepository error: session insertion failed ");
                                f0Var.close();
                                return false;
                            }
                            if (this.e == 0) {
                                b(j);
                            }
                        }
                        f0Var.close();
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (f0VarB == null) {
                            throw th2;
                        }
                        try {
                            f0VarB.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    zMoveToNext = false;
                }
            } catch (Throwable th5) {
                th = th5;
                Tracer.e("MyTrackerRepository error: session insertion failed ", th);
                return zMoveToNext;
            }
        } catch (Throwable th6) {
            th = th6;
            zMoveToNext = false;
            Tracer.e("MyTrackerRepository error: session insertion failed ", th);
            return zMoveToNext;
        }
    }

    public boolean a(long j, byte[] bArr) {
        try {
            if (this.a.c(6L) >= this.c && this.a.a(6L, bArr) == 0) {
                Tracer.d("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                Long lA = this.a.a("custom_events_skipped_count");
                long jLongValue = 1;
                if (lA != null) {
                    jLongValue = 1 + lA.longValue();
                }
                Tracer.d("MyTrackerRepository: skipped custom events count: " + jLongValue);
                this.a.a("custom_events_skipped_count", Long.valueOf(jLongValue));
                return false;
            }
            return a(6L, 22, false, true, j, bArr);
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: event insertion failed, type: 6", th);
            return false;
        }
    }

    public static d0 a(b0 b0Var) {
        try {
            return new d0(b0Var, 1000, 500, 500);
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public boolean a() {
        try {
            this.a.a();
            this.a.b();
            this.a.d();
            this.a.c();
            this.a.i();
            this.a.a("custom_events_skipped_count", (Long) null);
            this.f = 0L;
            f0 f0VarB = this.a.b("default_session");
            try {
                if (f0VarB.moveToNext()) {
                    b(f0VarB.f());
                } else {
                    b(0L);
                }
                f0VarB.close();
                return true;
            } catch (Throwable th) {
                if (f0VarB != null) {
                    try {
                        f0VarB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.g(14L);
            this.a.a(bArr);
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: ", th);
        }
    }

    public void a(long j) {
        try {
            this.a.a(j);
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: ", th);
        }
    }
}
