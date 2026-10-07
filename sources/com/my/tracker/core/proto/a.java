package com.my.tracker.core.proto;

import com.my.tracker.MyTracker;
import com.my.tracker.core.EngineInfoState;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.o.e;
import com.my.tracker.core.o.f0;
import com.my.tracker.core.o.g0;
import com.my.tracker.core.o.h0;
import com.my.tracker.core.o.j0;
import com.my.tracker.core.o.o;
import com.my.tracker.core.o.p;
import com.my.tracker.core.o.q;
import com.my.tracker.core.o.r;
import com.my.tracker.core.o.s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {
    final s c;
    final q d;

    public a(s sVar, q qVar) {
        this.c = sVar;
        this.d = qVar;
    }

    public static int a(ProtoWriter protoWriter, h0 h0Var, ByteArrayProtoWriter byteArrayProtoWriter) {
        int iWriteField;
        int i = 0;
        try {
            o oVarA = h0Var.a();
            iWriteField = 0;
            while (oVarA.moveToNext()) {
                try {
                    try {
                        long jA = oVarA.a();
                        int iE = (int) oVarA.e();
                        try {
                            byteArrayProtoWriter.reset();
                            p pVarA = h0Var.a(jA);
                            while (pVarA.moveToNext()) {
                                try {
                                    byteArrayProtoWriter.writeField(2, (int) pVarA.k());
                                } catch (Throwable th) {
                                    if (pVarA != null) {
                                        try {
                                            pVarA.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            pVarA.close();
                            if (byteArrayProtoWriter.size() == 0) {
                                Tracer.e("Error: no timestamps for event " + iE + ", event ignored");
                            } else {
                                byteArrayProtoWriter.writeField(1, iE);
                                long jB = oVarA.b();
                                if (jB > 0) {
                                    byteArrayProtoWriter.writeField(3, (int) jB);
                                }
                                byte[] bArrG = oVarA.g();
                                if (bArrG.length > 0) {
                                    int i2 = oVarA.i();
                                    if (i2 == -1) {
                                        Tracer.e("Error: unrecognized eventType " + iE + " with protoId " + i2 + ", event ignored");
                                    } else {
                                        byteArrayProtoWriter.writeField(i2, bArrG);
                                    }
                                }
                                iWriteField += protoWriter.writeField(41, byteArrayProtoWriter);
                                i++;
                            }
                        } catch (Throwable th3) {
                            Tracer.e("Error: failed to pack event " + iE, th3);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        Tracer.e("Error: failed to get stored events", th);
                        Tracer.d("Written: events=" + i + ", bytes=" + iWriteField);
                        return iWriteField;
                    }
                } catch (Throwable th5) {
                    if (oVarA != null) {
                        try {
                            oVarA.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            }
            oVarA.close();
        } catch (Throwable th7) {
            th = th7;
            iWriteField = 0;
        }
        Tracer.d("Written: events=" + i + ", bytes=" + iWriteField);
        return iWriteField;
    }

    public static void a(ProtoWriter protoWriter, TrackerConfig.ReadOnlyCopy readOnlyCopy, ByteArrayProtoWriter byteArrayProtoWriter) {
        byteArrayProtoWriter.reset();
        int i = readOnlyCopy.launchTimeout;
        if (i >= 0) {
            byteArrayProtoWriter.writeField(1, i);
        }
        byteArrayProtoWriter.writeField(2, 0);
        if (!readOnlyCopy.isTrackingEnvironmentEnabled) {
            byteArrayProtoWriter.writeField(3, 0);
        }
        if (!readOnlyCopy.isTrackingLaunchEnabled) {
            byteArrayProtoWriter.writeField(4, 0);
        }
        int i2 = readOnlyCopy.bufferingPeriod;
        if (i2 != 900) {
            byteArrayProtoWriter.writeField(5, i2);
        }
        int i3 = readOnlyCopy.forcingPeriod;
        if (i3 != 0) {
            byteArrayProtoWriter.writeField(6, i3);
        }
        byteArrayProtoWriter.writeField(7, 0);
        if (!readOnlyCopy.isTrackingPreinstallEnabled) {
            byteArrayProtoWriter.writeField(8, 0);
        }
        if (!readOnlyCopy.isTrackingPreinstallThirdPartyEnabled) {
            byteArrayProtoWriter.writeField(9, 0);
        }
        byteArrayProtoWriter.writeField(11, 0);
        byteArrayProtoWriter.writeField(12, 0);
        byteArrayProtoWriter.writeField(13, 0);
        byteArrayProtoWriter.writeField(14, 0);
        byteArrayProtoWriter.writeField(15, 0);
        if (byteArrayProtoWriter.size() > 0) {
            protoWriter.writeField(27, byteArrayProtoWriter);
        }
    }

    public static void a(ProtoWriter protoWriter, e eVar, ByteArrayProtoWriter byteArrayProtoWriter) {
        if (eVar.a.isEmpty()) {
            return;
        }
        for (e.a aVar : eVar.a) {
            byteArrayProtoWriter.reset();
            byteArrayProtoWriter.writeField(1, aVar.a);
            byteArrayProtoWriter.writeField(2, aVar.b);
            protoWriter.writeField(31, byteArrayProtoWriter);
        }
    }

    public static a a(s sVar, q qVar) {
        return new a(sVar, qVar);
    }

    public static int a(ProtoWriter protoWriter, j0 j0Var, ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2) {
        int i;
        int iWriteField = 0;
        try {
            f0 f0VarA = j0Var.a();
            i = 0;
            while (f0VarA.moveToNext()) {
                try {
                    try {
                        String name = f0VarA.getName();
                        byteArrayProtoWriter.reset();
                        try {
                            g0 g0VarA = j0Var.a(f0VarA.a());
                            while (g0VarA.moveToNext()) {
                                try {
                                    byteArrayProtoWriter2.reset();
                                    byteArrayProtoWriter2.writeField(1, (int) g0VarA.c());
                                    if (!g0VarA.h()) {
                                        byteArrayProtoWriter2.writeField(2, (int) g0VarA.d());
                                    }
                                    byteArrayProtoWriter.writeField(1, byteArrayProtoWriter2);
                                } catch (Throwable th) {
                                    if (g0VarA != null) {
                                        try {
                                            g0VarA.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            g0VarA.close();
                        } catch (Throwable th3) {
                            Tracer.e("Error: failed to read session " + name + ": ", th3);
                        }
                        if (byteArrayProtoWriter.size() == 0) {
                            Tracer.d("No periods for session " + name + ", id=" + f0VarA.a() + ", session ignored");
                        } else {
                            int iB = (int) f0VarA.b();
                            if (iB > 0) {
                                byteArrayProtoWriter.writeField(2, iB);
                            }
                            iWriteField += protoWriter.writeField(42, byteArrayProtoWriter);
                            i++;
                        }
                    } catch (Throwable th4) {
                        if (f0VarA != null) {
                            try {
                                f0VarA.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    Tracer.e("Error: failed to get stored sessions", th);
                }
            }
            f0VarA.close();
        } catch (Throwable th7) {
            th = th7;
            i = 0;
        }
        Tracer.d("Written: sessions=" + i + ", bytes=" + iWriteField);
        return iWriteField;
    }

    public synchronized boolean a(ProtoWriter protoWriter, long j) {
        if (j > 0) {
            try {
                protoWriter.writeField(4, j);
            } catch (Exception e) {
                Tracer.d("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public synchronized int a(ProtoWriter protoWriter, TrackerConfig.ReadOnlyCopy readOnlyCopy, EngineInfoState engineInfoState, long j, long j2, h0 h0Var, j0 j0Var) {
        try {
            if (a(protoWriter, h0Var, this.a) + a(protoWriter, j0Var, this.a, this.b) == 0) {
                Tracer.d("No events to send");
                return 3;
            }
            a(protoWriter, 0, readOnlyCopy, engineInfoState, j, j2, WriterTools.a(this.a, this.b, readOnlyCopy, engineInfoState));
            a();
            return 1;
        } catch (Exception e) {
            Tracer.d("Create packet error: " + e, e);
            a();
            return 2;
        }
    }

    public synchronized void a(ProtoWriter protoWriter, int i, TrackerConfig.ReadOnlyCopy readOnlyCopy, EngineInfoState engineInfoState, long j, long j2, WriterTools writerTools) {
        String str;
        String str2;
        try {
            ByteArrayProtoWriter byteArrayProtoWriter = writerTools.mainWriter;
            ByteArrayProtoWriter byteArrayProtoWriter2 = writerTools.secondWriter;
            r rVarA = this.c.a(readOnlyCopy.installedProvider, engineInfoState.kidMode);
            protoWriter.writeField(1, MyTracker.getVersion());
            protoWriter.writeField(2, readOnlyCopy.id);
            if (j != -1) {
                protoWriter.writeField(3, j);
            }
            Map<String, String> map = readOnlyCopy.trackerParams.customParams;
            if (j2 > 0) {
                protoWriter.writeField(5, (int) j2);
            }
            if (i == 0) {
                protoWriter.writeMapStringString(43, map, byteArrayProtoWriter2);
            }
            if (engineInfoState.kidMode || map.isEmpty()) {
                str = null;
                str2 = null;
            } else {
                String str3 = map.get("android_id");
                str = map.get("mac");
                str2 = str3;
            }
            b.a(protoWriter, rVarA.a, rVarA.b, byteArrayProtoWriter, byteArrayProtoWriter2);
            b.a(protoWriter, engineInfoState.kidMode, engineInfoState.userInfoState, byteArrayProtoWriter);
            b.a(protoWriter, str2, str, rVarA, byteArrayProtoWriter, byteArrayProtoWriter2);
            if (!engineInfoState.kidMode) {
                this.d.a(3, protoWriter, writerTools);
            }
            if (i == 0) {
                a(protoWriter, readOnlyCopy, this.a);
            }
            if (!engineInfoState.kidMode) {
                this.d.a(2, protoWriter, writerTools);
            }
            if (i == 0) {
                a(protoWriter, rVarA.e, this.a);
                if (!engineInfoState.kidMode) {
                    this.d.a(4, protoWriter, writerTools);
                }
                this.d.a(1, protoWriter, engineInfoState.remoteConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
