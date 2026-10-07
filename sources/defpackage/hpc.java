package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.regex.Matcher;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.SessionDescription;
import org.webrtc.Size;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hpc implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ hpc(qpc qpcVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = qpcVar;
        this.c = sessionDescription;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0316  */
    /* JADX WARN: Code duplicated, block: B:117:0x031c  */
    /* JADX WARN: Code duplicated, block: B:122:0x032a  */
    @Override // defpackage.sg4
    public final void accept(Object obj) {
        SessionDescription.Type type;
        String str;
        String str2;
        Object poeVar;
        Throwable thA;
        String message;
        int iNextIndex;
        int i;
        int i2;
        SessionDescription.Type type2;
        String strGroup;
        int i3 = 0;
        switch (this.a) {
            case 0:
                qpc qpcVar = this.b;
                SessionDescription sessionDescription = this.c;
                PeerConnection peerConnection = (PeerConnection) obj;
                qpcVar.getClass();
                String str3 = sessionDescription.description;
                y3e y3eVar = qpcVar.w;
                xml.c(str3, y3eVar);
                String strD = qpcVar.d(str3, true);
                if (qpcVar.f) {
                    Object[] objArr = {"opus", "red"};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i4 = 2; i3 < i4; i4 = 2) {
                        Object obj2 = objArr[i3];
                        Objects.requireNonNull(obj2);
                        arrayList.add(obj2);
                        i3++;
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    vfk vfkVarA = xml.a(true, strD.split("\r\n"), y3eVar);
                    if (vfkVarA == null || !vfkVarA.d(listUnmodifiableList)) {
                        y3eVar.reportException("PeerConnectionClient", "SDP has no 'Opus' codec; cannot remove others", new IllegalArgumentException("SDP has no 'Opus' codec; cannot remove others"));
                    } else {
                        strD = xml.f(strD, true, listUnmodifiableList, null, y3eVar);
                    }
                }
                String strE = xml.e(xml.e(xml.b(strD, "dred", "100", y3eVar), Collections.singletonList("opus"), MediaStreamTrack.AUDIO_TRACK_KIND, true, y3eVar), Collections.singletonList("red"), MediaStreamTrack.AUDIO_TRACK_KIND, true, y3eVar);
                String str4 = "";
                String strB = xml.b(zo5.p(strE, strE.endsWith("\n") ? "" : "\r\n", "a=animoji:2\r\n"), "usedtx", String.valueOf(1), y3eVar);
                if (qpcVar.g) {
                    strB = xml.e(strB, Collections.singletonList("H265"), MediaStreamTrack.VIDEO_TRACK_KIND, false, y3eVar);
                }
                String str5 = strB;
                if (qpcVar.S) {
                    ewe eweVar = qpcVar.o;
                    RtpSender rtpSender = qpcVar.L;
                    String str6 = qpcVar.T.a;
                    int i5 = qpcVar.m;
                    Size size = (i5 == 0 || (i2 = qpcVar.n) == 0) ? new Size(960, 544) : new Size(i5, i2);
                    eweVar.getClass();
                    rtpSender.getClass();
                    t7g t7gVar = new t7g(str6, eweVar.o(rtpSender, size));
                    try {
                        ArrayList arrayList2 = new ArrayList(r5h.m1(r5h.y1(str5).toString(), new String[]{"\r\n"}, 6));
                        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                String str7 = (String) listIterator.previous();
                                if (z5h.K0(str7, "a=mid:", false) && cqk.d(r5h.y1(str7.substring(6)).toString(), t7gVar.a)) {
                                    iNextIndex = listIterator.nextIndex();
                                }
                            } else {
                                iNextIndex = -1;
                            }
                        }
                        if (iNextIndex >= 0) {
                            int i6 = iNextIndex + 1;
                            ufe ufeVar = new ufe();
                            Iterator it = arrayList2.subList(i6, arrayList2.size()).iterator();
                            int i7 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    String str8 = (String) it.next();
                                    str = str5;
                                    try {
                                        if (z5h.K0(str8, "a=mid:", false)) {
                                            str2 = str4;
                                        } else {
                                            str2 = str4;
                                            try {
                                                if (!z5h.K0(str8, "m=", false)) {
                                                    i7++;
                                                    str5 = str;
                                                    str4 = str2;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                poeVar = new poe(th);
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    message = thA.getMessage();
                                                    if (message == null) {
                                                        message = str2;
                                                    }
                                                    y3eVar.reportException("SimulcastSdpProcessor", message, thA);
                                                }
                                                if (roe.a(poeVar) != null) {
                                                    poeVar = str;
                                                }
                                                str5 = (String) poeVar;
                                            }
                                        }
                                        i = i7;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str2 = str4;
                                        poeVar = new poe(th);
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            message = thA.getMessage();
                                            if (message == null) {
                                                message = str2;
                                            }
                                            y3eVar.reportException("SimulcastSdpProcessor", message, thA);
                                        }
                                        if (roe.a(poeVar) != null) {
                                            poeVar = str;
                                        }
                                        str5 = (String) poeVar;
                                    }
                                } else {
                                    str = str5;
                                    str2 = str4;
                                    i = -1;
                                }
                            }
                            Integer numValueOf = (i < 0 || i == i6) ? null : Integer.valueOf(i);
                            int iIntValue = (numValueOf != null ? numValueOf.intValue() : arrayList2.size() - i6) + i6;
                            cx3.d1(arrayList2.subList(i6, iIntValue), new ptf(6, ufeVar));
                            List list = t7gVar.b;
                            ArrayList arrayList3 = new ArrayList(yw3.W0(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((u7g) it2.next()).a());
                            }
                            arrayList2.addAll(iIntValue - ufeVar.a, arrayList3);
                            arrayList2.addAll((iIntValue - ufeVar.a) + arrayList3.size(), t7gVar.a());
                            str5 = ww3.z1(arrayList2, "\r\n", null, null, null, 62) + "\r\n";
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str5;
                    }
                    qpcVar.H();
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, str5);
                y3eVar.log("PeerConnectionClient", qpcVar.toString() + ": set local sdp from " + sessionDescription2.type);
                wbb wbbVar = qpcVar.y.n;
                if (ww3.j1(xw3.P0(wbb.c, wbb.e, wbb.g, wbb.i), wbbVar) && wbbVar != null) {
                    switch (wbbVar.ordinal()) {
                        case 0:
                        case 2:
                        case 3:
                            type = SessionDescription.Type.OFFER;
                            break;
                        case 1:
                        case 4:
                        case 5:
                            type = SessionDescription.Type.ANSWER;
                            break;
                        case 6:
                        case 7:
                            type = SessionDescription.Type.PRANSWER;
                            break;
                        case 8:
                        case 9:
                            type = SessionDescription.Type.ROLLBACK;
                            break;
                        default:
                            ore.o();
                            break;
                    }
                    sessionDescription2 = new SessionDescription(type, "fake sdp");
                }
                peerConnection.setLocalDescription(new mpc(qpcVar, sessionDescription2, 0), sessionDescription2);
                break;
            default:
                qpc qpcVar2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                String str9 = sessionDescription3.description;
                xml.c(str9, qpcVar2.w);
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, qpcVar2.d(str9, false));
                if (qpcVar2.h.c == null) {
                    Matcher matcher = qpc.h0.matcher(sessionDescription3.description);
                    int i8 = (!matcher.find() || (strGroup = matcher.group(1)) == null) ? 1 : Integer.parseInt(strGroup);
                    qpcVar2.x.getClass();
                    int iMin = Math.min(i8, 2);
                    qpcVar2.w.log("PeerConnectionClient", qpcVar2.toString() + ": set animoji protocol version: " + iMin + "(local: 2, remote: " + i8 + ")");
                    an anVar = qpcVar2.h;
                    if (anVar.c != null) {
                        Throwable th4 = new Throwable("Resetting animoji protocol version");
                        CidLogger cidLogger = anVar.a.b;
                        String message2 = th4.getMessage();
                        if (message2 == null) {
                            message2 = "animoji error";
                        }
                        cidLogger.logException("AniSend", message2, th4);
                    }
                    anVar.c = Integer.valueOf(iMin);
                    i46 i46Var = anVar.g;
                    if (i46Var != null) {
                        i46Var.b();
                    }
                }
                qpcVar2.w.log("PeerConnectionClient", qpcVar2.toString() + ": set remote sdp from " + sessionDescription3.type);
                wbb wbbVar2 = qpcVar2.y.n;
                if (ww3.j1(xw3.P0(wbb.d, wbb.f, wbb.h, wbb.j), wbbVar2) && wbbVar2 != null) {
                    switch (wbbVar2.ordinal()) {
                        case 0:
                        case 2:
                        case 3:
                            type2 = SessionDescription.Type.OFFER;
                            break;
                        case 1:
                        case 4:
                        case 5:
                            type2 = SessionDescription.Type.ANSWER;
                            break;
                        case 6:
                        case 7:
                            type2 = SessionDescription.Type.PRANSWER;
                            break;
                        case 8:
                        case 9:
                            type2 = SessionDescription.Type.ROLLBACK;
                            break;
                        default:
                            ore.o();
                            break;
                    }
                    sessionDescription4 = new SessionDescription(type2, "fake sdp");
                }
                peerConnection2.setRemoteDescription(new mpc(qpcVar2, sessionDescription4, 1), sessionDescription4);
                break;
        }
    }
}
