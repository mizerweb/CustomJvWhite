package defpackage;

import java.util.Map;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;
import one.video.exo.error.OneVideoExoUnexpectedException;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.android.onelog.OneLogSessionEventNumbering;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kvb {
    public static OneLogItem a(String str, h4d h4dVar, lk8 lk8Var, Object obj, Long l) {
        c1e c1eVar;
        OneLogItem.Builder custom = OneLogItem.builder().setCollector(jvb.c).setType(1).setOperation(str).setCount(1).setTime(0L).setCustom("app", jvb.b).setCustom("vid", h4dVar.a);
        String str2 = h4dVar.b;
        OneLogItem.Builder custom2 = custom.setCustom("vsid", str2).setCustom("cdn_host", h4dVar.d).setCustom("ct", h4dVar.e);
        boolean z = h4dVar.g;
        OneLogItem.Builder custom3 = custom2.setCustom("auto", Boolean.valueOf(z)).setCustom("stat_type", z ? "auto" : "").setCustom("place", h4dVar.f).setCustom("in_history", Boolean.valueOf(h4dVar.i));
        xc7 xc7Var = lk8Var.b;
        c1e c1eVar2 = null;
        if (xc7Var != null) {
            switch (xc7Var.ordinal()) {
                case 0:
                    c1eVar = c1e._144p;
                    break;
                case 1:
                    c1eVar = c1e._240p;
                    break;
                case 2:
                    c1eVar = c1e._360p;
                    break;
                case 3:
                    c1eVar = c1e._480p;
                    break;
                case 4:
                    c1eVar = c1e._720p;
                    break;
                case 5:
                    c1eVar = c1e._1080p;
                    break;
                case 6:
                    c1eVar = c1e._1440p;
                    break;
                case 7:
                    c1eVar = c1e._2160p;
                    break;
                case 8:
                    c1eVar = c1e._4320p;
                    break;
                default:
                    ore.o();
                    return null;
            }
            c1eVar2 = c1eVar;
        }
        OneLogItem.Builder custom4 = custom3.setCustom("quality", c1eVar2).setCustom("param", obj);
        if (l != null && l.longValue() >= 0) {
            custom4.setTime(l.longValue());
        }
        Long l2 = lk8Var.a;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (jLongValue != 0) {
                custom4.setCustom("live_seek", Long.valueOf(jLongValue));
            }
        }
        if (lk8Var.c) {
            custom4.setCustom((Object) "manual_quality", (Object) 1);
        }
        boolean z2 = nec.a;
        for (Map.Entry<String, Object> entry : OneLogSessionEventNumbering.INSTANCE.updateEventNumberFor(str2, h4dVar.j).entrySet()) {
            custom4.setCustom(entry.getKey(), entry.getValue());
        }
        return custom4.build();
    }

    public static void b(String str, h4d h4dVar, lk8 lk8Var, Object obj, Long l) {
        if (h4dVar.a != null) {
            a(str, h4dVar, lk8Var, obj, l).log();
        }
    }

    public static void c(h4d h4dVar, lk8 lk8Var, long j) {
        b("download_bytes", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void d(h4d h4dVar, lk8 lk8Var, long j) {
        b("close_at_empty_buffer", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void e(h4d h4dVar, lk8 lk8Var, t4j t4jVar) {
        c1e c1eVar;
        kwi kwiVar;
        xc7 xc7VarC;
        if (t4jVar == null || (kwiVar = (kwi) t4jVar.b) == null || (xc7VarC = kwiVar.c()) == null) {
            c1eVar = null;
        } else {
            switch (xc7VarC.ordinal()) {
                case 0:
                    c1eVar = c1e._144p;
                    break;
                case 1:
                    c1eVar = c1e._240p;
                    break;
                case 2:
                    c1eVar = c1e._360p;
                    break;
                case 3:
                    c1eVar = c1e._480p;
                    break;
                case 4:
                    c1eVar = c1e._720p;
                    break;
                case 5:
                    c1eVar = c1e._1080p;
                    break;
                case 6:
                    c1eVar = c1e._1440p;
                    break;
                case 7:
                    c1eVar = c1e._2160p;
                    break;
                case 8:
                    c1eVar = c1e._4320p;
                    break;
                default:
                    ore.o();
                    return;
            }
        }
        b("quality", h4dVar, lk8Var, c1eVar, null);
    }

    public static void f(h4d h4dVar, lk8 lk8Var, long j) {
        b("empty_buffer", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void g(h4d h4dVar, lk8 lk8Var, OneVideoExoPlaybackException oneVideoExoPlaybackException) {
        ux9 ux9Var;
        String strA;
        e87 e87Var;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(oneVideoExoPlaybackException.b);
        sb.append(".");
        sb.append(oneVideoExoPlaybackException.c);
        int iOrdinal = oneVideoExoPlaybackException.c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                OneVideoExoRendererException oneVideoExoRendererException = oneVideoExoPlaybackException.e;
                if (oneVideoExoRendererException != null && (str = oneVideoExoRendererException.a) != null) {
                    sb.append(".");
                    sb.append(str);
                }
                OneVideoExoRendererException oneVideoExoRendererException2 = oneVideoExoPlaybackException.e;
                if (oneVideoExoRendererException2 != null && (e87Var = oneVideoExoRendererException2.c) != null) {
                    sb.append(".");
                    sb.append(e87Var);
                }
                OneVideoExoRendererException oneVideoExoRendererException3 = oneVideoExoPlaybackException.e;
                if (oneVideoExoRendererException3 != null && (ux9Var = oneVideoExoRendererException3.b) != null && (strA = ux9Var.a()) != null) {
                    sb.append(".");
                    sb.append(strA);
                }
                OneVideoExoRendererException oneVideoExoRendererException4 = oneVideoExoPlaybackException.e;
                if (oneVideoExoRendererException4 != null) {
                    sb.append(".");
                    String message = oneVideoExoRendererException4.getMessage();
                    sb.append(message != null ? message : "UNKNOWN_MESSAGE");
                }
            } else if (iOrdinal == 2) {
                OneVideoExoUnexpectedException oneVideoExoUnexpectedException = oneVideoExoPlaybackException.f;
                if (oneVideoExoUnexpectedException != null) {
                    sb.append(".");
                    String message2 = oneVideoExoUnexpectedException.getMessage();
                    sb.append(message2 != null ? message2 : "UNKNOWN_MESSAGE");
                }
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                ore.o();
                return;
            } else {
                sb.append(".");
                String message3 = oneVideoExoPlaybackException.getMessage();
                sb.append(message3 != null ? message3 : "UNKNOWN_MESSAGE");
            }
        } else {
            OneVideoExoSourceException oneVideoExoSourceException = oneVideoExoPlaybackException.d;
            if (oneVideoExoSourceException != null) {
                sb.append(".");
                sb.append(oneVideoExoSourceException.getMessage());
            }
        }
        b("content_error", h4dVar, lk8Var, sb.toString(), null);
    }

    public static void h(h4d h4dVar, lk8 lk8Var, long j) {
        b("first_bytes", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void i(h4d h4dVar, lk8 lk8Var, long j) {
        b("first_frame", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void j(h4d h4dVar, lk8 lk8Var, long j) {
        b("playing", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void k(h4d h4dVar, lk8 lk8Var, long j) {
        b("pause", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void l(h4d h4dVar, lk8 lk8Var, long j) {
        if (h4dVar.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m147sendPCEVtD0(a("play", h4dVar, lk8Var, Long.valueOf(j), null), null);
        }
    }

    public static void m(h4d h4dVar, lk8 lk8Var, long j) {
        b("player_ready", h4dVar, lk8Var, Long.valueOf(j), null);
    }

    public static void n(h4d h4dVar, lk8 lk8Var, long j) {
        b("seek", h4dVar, lk8Var, "unknown", Long.valueOf(j / 1000));
    }

    public static void o(h4d h4dVar, lk8 lk8Var) {
        b("stop", h4dVar, lk8Var, null, null);
    }

    public static void p(h4d h4dVar, lk8 lk8Var, String str) {
        if (h4dVar.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m147sendPCEVtD0(a("watch_coverage_live", h4dVar, lk8Var, str, null), null);
        }
    }

    public static void q(h4d h4dVar, lk8 lk8Var, String str) {
        if (h4dVar.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m147sendPCEVtD0(a("watch_coverage_record", h4dVar, lk8Var, str, null), null);
        }
    }
}
