package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jpc implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ IceCandidate c;

    public /* synthetic */ jpc(qpc qpcVar, IceCandidate iceCandidate, int i) {
        this.a = i;
        this.b = qpcVar;
        this.c = iceCandidate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sg4
    public final void accept(Object obj) {
        String strGroup;
        lgk lgkVar;
        int i = this.a;
        byte b = 0;
        byte b2 = 0;
        IceCandidate iceCandidate = this.c;
        qpc qpcVar = this.b;
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (i) {
            case 0:
                peerConnection.addIceCandidate(iceCandidate, new uvc(qpcVar, iceCandidate, b2 == true ? 1 : 0, 26));
                p38 p38Var = qpcVar.A;
                if (p38Var.c == 0) {
                    p38Var.c = SystemClock.elapsedRealtime();
                }
                break;
            default:
                qpcVar.f0.f("pc.candidate " + iceCandidate.sdp);
                p38 p38Var2 = qpcVar.A;
                HashMap map = p38Var2.b;
                if (!p38Var2.d) {
                    SystemClock.elapsedRealtime();
                    Matcher matcher = p38.e.matcher(iceCandidate.sdp);
                    if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                        switch (strGroup.hashCode()) {
                            case 3208616:
                                if (!strGroup.equals(CandidateTypeHintConfig.TYPE_HOST)) {
                                    b = -1;
                                }
                                break;
                            case 106932016:
                                b = !strGroup.equals(CandidateTypeHintConfig.TYPE_PRFLX) ? (byte) -1 : (byte) 1;
                                break;
                            case 108397201:
                                b = !strGroup.equals(CandidateTypeHintConfig.TYPE_RELAY) ? (byte) -1 : (byte) 2;
                                break;
                            case 109702579:
                                b = !strGroup.equals(CandidateTypeHintConfig.TYPE_SRFLX) ? (byte) -1 : (byte) 3;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        String lowerCase = null;
                        switch (b) {
                            case 0:
                                break;
                            case 1:
                            case 2:
                            case 3:
                                String str = iceCandidate.serverUrl;
                                if (str != null) {
                                    Matcher matcher2 = p38.f.matcher(str);
                                    if (matcher2.matches()) {
                                        lowerCase = matcher2.group(1);
                                    }
                                }
                                if (lowerCase == null) {
                                    lowerCase = "udp";
                                    break;
                                } else {
                                    lowerCase = lowerCase.toLowerCase();
                                    break;
                                }
                            default:
                                if (CandidateTypeHintConfig.TYPE_RELAY.equals(strGroup)) {
                                    lgkVar = "tcp".equals(lowerCase) ? lgk.a : lgk.b;
                                    Matcher matcher3 = p38.g.matcher(iceCandidate.sdp);
                                    if (matcher3.matches()) {
                                        matcher3.group(1);
                                    }
                                } else if (!CandidateTypeHintConfig.TYPE_SRFLX.equals(strGroup)) {
                                    p38Var2.a.log("CandidateLog", "not logging (unknown?) type: ".concat(strGroup));
                                } else {
                                    lgkVar = lgk.c;
                                }
                                map.put(lgkVar, Integer.valueOf(((Integer) map.get(lgkVar)).intValue() + 1));
                                break;
                        }
                    }
                }
                qpcVar.Q.add(iceCandidate);
                qpcVar.w.log("PeerConnectionClient", "❄ -> ice candidate: " + iceCandidate);
                qpcVar.r.post(new i7b(qpcVar, 12, iceCandidate));
                break;
        }
    }
}
