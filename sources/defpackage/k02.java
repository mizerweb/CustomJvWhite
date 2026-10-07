package defpackage;

import java.util.Map;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class k02 implements AnalyticsEventListener {
    public final ny8 a;

    public k02(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x021a  */
    /* JADX WARN: Code duplicated, block: B:114:0x021e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02be  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:167:0x0307  */
    /* JADX WARN: Code duplicated, block: B:168:0x030d  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01aa  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x02dc, please report this as an issue */
    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener
    public final void onAnalyticsEvent(AnalyticsEventListener.AnalyticsEvent analyticsEvent) {
        g85 g85Var;
        g85 g85Var2;
        g85 g85Var3;
        Long lValueOf;
        boolean zEndsWith;
        Long lValueOf2;
        Long l;
        Object obj;
        String string;
        Long lValueOf3;
        Long lValueOf4;
        j02 j02Var = (j02) this.a.getValue();
        String name = analyticsEvent.getName();
        Number value = analyticsEvent.getValue();
        String stringValue = analyticsEvent.getStringValue();
        analyticsEvent.getTimestamp();
        Map<String, Object> data = analyticsEvent.getData();
        j02Var.getClass();
        switch (name.hashCode()) {
            case -1895686939:
                g85Var = !name.equals("ice_candidate_gathering_failed") ? null : new g85("ice_candidate_gathering_failed_sdk", (String) null, (Long) null, stringValue, 22);
                break;
            case -1842281609:
                if (!name.equals("webtransport_failed_exception")) {
                    g85Var = null;
                } else {
                    zEndsWith = name.endsWith("pings");
                    String str = zEndsWith ? "pings" : "exception";
                    String strA = j02.a(name);
                    if (value != null) {
                        lValueOf2 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf2 = null;
                    }
                    if (zEndsWith) {
                        l = lValueOf2;
                    } else {
                        l = null;
                    }
                    obj = data.get("failed_error");
                    if (obj != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    g85Var3 = new g85("transport_error_sdk", strA, l, string, str);
                    g85Var = g85Var3;
                }
                break;
            case -1584253506:
                if (!name.equals("websocket_reconnected")) {
                    g85Var = null;
                } else {
                    String strA2 = j02.a(name);
                    if (value != null) {
                        lValueOf = Long.valueOf(value.longValue());
                    } else {
                        lValueOf = null;
                    }
                    g85Var3 = new g85("transport_reconnected_sdk", strA2, lValueOf, (String) null, 24);
                    g85Var = g85Var3;
                }
                break;
            case -1514578942:
                if (!name.equals("first_media_sent")) {
                    g85Var = null;
                } else {
                    g85Var2 = new g85("first_media_sent_sdk", (String) null, (Long) null, (String) null, 30);
                    g85Var = g85Var2;
                }
                break;
            case -1233178293:
                if (!name.equals("first_media_received")) {
                    g85Var = null;
                } else {
                    Object obj2 = data.get("call_type");
                    g85Var = new g85("first_media_received_sdk", obj2 != null ? obj2.toString() : null, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 24);
                }
                break;
            case -1046385071:
                g85Var = !name.equals("call_init") ? null : new g85("call_init_sdk", (String) null, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 26);
                break;
            case -941312919:
                if (!name.equals("webtransport_failed_pings")) {
                    g85Var = null;
                } else {
                    zEndsWith = name.endsWith("pings");
                    String str2 = zEndsWith ? "pings" : "exception";
                    String strA3 = j02.a(name);
                    if (value != null) {
                        lValueOf2 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf2 = null;
                    }
                    if (zEndsWith) {
                        l = lValueOf2;
                    } else {
                        l = null;
                    }
                    obj = data.get("failed_error");
                    if (obj != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    g85Var3 = new g85("transport_error_sdk", strA3, l, string, str2);
                    g85Var = g85Var3;
                }
                break;
            case -931702551:
                if (!name.equals("websocket_timeout")) {
                    g85Var = null;
                } else {
                    if (value != null) {
                        lValueOf4 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf4 = null;
                    }
                    g85Var = new g85("transport_timeout_sdk", (String) null, lValueOf4, (String) null, 26);
                }
                break;
            case -644068972:
                if (!name.equals("call_finish")) {
                    g85Var = null;
                } else {
                    Object obj3 = data.get("reason");
                    g85Var = new g85("call_finish_sdk", obj3 != null ? obj3.toString() : null, (Long) null, stringValue, 20);
                }
                break;
            case -337233565:
                if (!name.equals("call_accepted_outgoing")) {
                    g85Var = null;
                } else {
                    g85Var2 = new g85("call_accepted_outgoing_sdk", (String) null, (Long) null, (String) null, 30);
                    g85Var = g85Var2;
                }
                break;
            case -306119139:
                g85Var = !name.equals("call_accepted_incoming") ? null : new g85("call_accepted_incoming_sdk", stringValue, (Long) null, (String) null, 28);
                break;
            case 18336293:
                if (!name.equals("webtransport_restart")) {
                    g85Var = null;
                } else {
                    g85Var = new g85("transport_restart_sdk", j02.a(name), (Long) null, (String) null, 28);
                }
                break;
            case 44715407:
                g85Var = !name.equals("sdp_generated") ? null : new g85("sdp_generated_sdk", stringValue, (Long) null, (String) null, 28);
                break;
            case 448290636:
                if (!name.equals("webtransport_reconnected")) {
                    g85Var = null;
                } else {
                    String strA4 = j02.a(name);
                    if (value != null) {
                        lValueOf = Long.valueOf(value.longValue());
                    } else {
                        lValueOf = null;
                    }
                    g85Var3 = new g85("transport_reconnected_sdk", strA4, lValueOf, (String) null, 24);
                    g85Var = g85Var3;
                }
                break;
            case 461939045:
                if (!name.equals("connection_state_changed")) {
                    g85Var = null;
                } else {
                    Object obj4 = data.get("connection_state");
                    g85Var2 = new g85("connection_state_changed_sdk", obj4 != null ? obj4.toString() : null, (Long) null, (String) null, 28);
                    g85Var = g85Var2;
                }
                break;
            case 474328119:
                if (!name.equals("websocket_failed_pings")) {
                    g85Var = null;
                } else {
                    zEndsWith = name.endsWith("pings");
                    String str3 = zEndsWith ? "pings" : "exception";
                    String strA5 = j02.a(name);
                    if (value != null) {
                        lValueOf2 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf2 = null;
                    }
                    if (zEndsWith) {
                        l = lValueOf2;
                    } else {
                        l = null;
                    }
                    obj = data.get("failed_error");
                    if (obj != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    g85Var3 = new g85("transport_error_sdk", strA5, l, string, str3);
                    g85Var = g85Var3;
                }
                break;
            case 772020319:
                g85Var = !name.equals("audio_error") ? null : new g85("audio_error_sdk", stringValue, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 24);
                break;
            case 1006119691:
                g85Var = !name.equals("ice_candidate_add_failed") ? null : new g85("ice_candidate_add_failed_sdk", (String) null, (Long) null, stringValue, 22);
                break;
            case 1101540089:
                if (!name.equals("ice_candidates_changed")) {
                    g85Var = null;
                } else {
                    g85Var2 = new g85("ice_candidates_changed_sdk", (String) null, (Long) null, (String) null, 30);
                    g85Var = g85Var2;
                }
                break;
            case 1136584102:
                g85Var = !name.equals("client_requested_server_topology") ? null : new g85("client_requested_server_topology_sdk", stringValue, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 24);
                break;
            case 1223374148:
                g85Var = !name.equals("signaling_connected") ? null : new g85("signaling_connected_sdk", (String) null, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 26);
                break;
            case 1400223201:
                g85Var = !name.equals("sdp_received") ? null : new g85("sdp_received_sdk", stringValue, (Long) null, (String) null, 28);
                break;
            case 1479715223:
                if (!name.equals("websocket_restart")) {
                    g85Var = null;
                } else {
                    g85Var = new g85("transport_restart_sdk", j02.a(name), (Long) null, (String) null, 28);
                }
                break;
            case 1519739973:
                if (!name.equals("websocket_failed_exception")) {
                    g85Var = null;
                } else {
                    zEndsWith = name.endsWith("pings");
                    String str4 = zEndsWith ? "pings" : "exception";
                    String strA6 = j02.a(name);
                    if (value != null) {
                        lValueOf2 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf2 = null;
                    }
                    if (zEndsWith) {
                        l = lValueOf2;
                    } else {
                        l = null;
                    }
                    obj = data.get("failed_error");
                    if (obj != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    g85Var3 = new g85("transport_error_sdk", strA6, l, string, str4);
                    g85Var = g85Var3;
                }
                break;
            case 1651326097:
                if (!name.equals("websocket_connected")) {
                    g85Var = null;
                } else {
                    String strA7 = j02.a(name);
                    if (value != null) {
                        lValueOf3 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf3 = null;
                    }
                    g85Var3 = new g85("transport_connected_sdk", strA7, lValueOf3, (String) null, 24);
                    g85Var = g85Var3;
                }
                break;
            case 1720480159:
                if (!name.equals("webtransport_connected")) {
                    g85Var = null;
                } else {
                    String strA8 = j02.a(name);
                    if (value != null) {
                        lValueOf3 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf3 = null;
                    }
                    g85Var3 = new g85("transport_connected_sdk", strA8, lValueOf3, (String) null, 24);
                    g85Var = g85Var3;
                }
                break;
            case 1901885815:
                if (!name.equals("webtransport_timeout")) {
                    g85Var = null;
                } else {
                    if (value != null) {
                        lValueOf4 = Long.valueOf(value.longValue());
                    } else {
                        lValueOf4 = null;
                    }
                    g85Var = new g85("transport_timeout_sdk", (String) null, lValueOf4, (String) null, 26);
                }
                break;
            case 1931207489:
                g85Var = !name.equals("call_start") ? null : new g85("call_start_sdk", (String) null, value != null ? Long.valueOf(value.longValue()) : null, (String) null, 26);
                break;
            default:
                g85Var = null;
                break;
        }
        if (g85Var == null) {
            return;
        }
        sa2 sa2Var = (sa2) j02Var.a.getValue();
        String str5 = (String) g85Var.a;
        Object obj5 = data.get("vcid");
        String string2 = obj5 != null ? obj5.toString() : null;
        String str6 = (String) g85Var.b;
        Long l2 = (Long) g85Var.c;
        String str7 = (String) g85Var.d;
        String str8 = (String) g85Var.e;
        sa2Var.getClass();
        sa2.c(sa2Var, str5, string2, str6, l2, str8, str7, false, null, HttpStatus.SC_BAD_REQUEST);
    }
}
