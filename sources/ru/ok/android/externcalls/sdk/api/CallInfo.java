package ru.ok.android.externcalls.sdk.api;

import defpackage.g2d;
import defpackage.hu8;
import defpackage.j95;
import defpackage.np0;
import defpackage.ot4;
import defpackage.r66;
import defpackage.vu8;
import defpackage.zo5;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB±\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallInfo;", "", ApiProtocol.KEY_ENDPOINT, "", "wsIps", "", "wtEndpoint", "wtIps", "id", ApiProtocol.KEY_TOKEN, "clientType", ApiProtocol.PARAM_JOIN_LINK, "isConcurrent", "", "turnServer", "Lorg/webrtc/PeerConnection$IceServer;", "stunServer", "isP2PForbidden", "deviceIndex", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZI)V", "getFormattedJoinLink", "route", "toParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final hu8 PARSER;
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isConcurrent;
    public final boolean isP2PForbidden;
    public final String joinLink;
    public final List<PeerConnection.IceServer> stunServer;
    public final String token;
    public final List<PeerConnection.IceServer> turnServer;
    public final List<String> wsIps;
    public final String wtEndpoint;
    public final List<String> wtIps;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        PARSER = new ot4(13, companion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallInfo(String str, List list, String str2, List list2, String str3, String str4, String str5, String str6, boolean z, List list3, List list4, boolean z2, int i, int i2, j95 j95Var) {
        str = (i2 & 1) != 0 ? null : str;
        List list5 = (i2 & 2) != 0 ? null : list;
        String str7 = (i2 & 4) != 0 ? null : str2;
        List list6 = (i2 & 8) != 0 ? null : list2;
        String str8 = (i2 & 16) != 0 ? null : str3;
        String str9 = (i2 & 32) != 0 ? null : str4;
        String str10 = (i2 & 64) != 0 ? null : str5;
        String str11 = (i2 & np0.m) == 0 ? str6 : null;
        boolean z3 = (i2 & np0.n) != 0 ? false : z;
        int i3 = i2 & np0.o;
        List list7 = r66.a;
        this(str, list5, str7, list6, str8, str9, str10, str11, z3, i3 != 0 ? list7 : list3, (i2 & 1024) == 0 ? list4 : list7, (i2 & np0.q) != 0 ? false : z2, (i2 & np0.r) != 0 ? 0 : i);
    }

    private static final CallInfo parse(vu8 vu8Var) throws JsonTypeMismatchException, IOException {
        return INSTANCE.parse(vu8Var);
    }

    public final String getFormattedJoinLink(String route) {
        return zo5.o(route, this.joinLink);
    }

    public final ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turnServer);
        linkedList.addAll(this.stunServer);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        return conversationParams;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallInfo$Companion;", "", "<init>", "()V", "Lvu8;", "reader", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "parse", "(Lvu8;)Lru/ok/android/externcalls/sdk/api/CallInfo;", "", ApiProtocol.PARAM_CONVERSATION_ID, "", "withIp", "startConversationDelegateResultParse", "(Lvu8;Ljava/lang/String;Z)Lru/ok/android/externcalls/sdk/api/CallInfo;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;", "result", "createFromStartConversationDelegateResult$calls_sdk", "(Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;Z)Lru/ok/android/externcalls/sdk/api/CallInfo;", "createFromStartConversationDelegateResult", "Lhu8;", "PARSER", "Lhu8;", "getPARSER", "()Lhu8;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final CallInfo parse(vu8 reader) throws JsonTypeMismatchException, IOException {
            reader.p();
            String strF = null;
            String strF2 = null;
            String strF3 = null;
            String strF4 = null;
            String strF5 = null;
            String strF6 = null;
            boolean zV = false;
            boolean zV2 = false;
            int iZ = 0;
            List<PeerConnection.IceServer> turn = r66.a;
            List<PeerConnection.IceServer> stun = turn;
            while (reader.hasNext()) {
                String strName = reader.name();
                switch (strName.hashCode()) {
                    case -494324241:
                        if (!strName.equals(ApiProtocol.KEY_JOIN_LINK)) {
                            reader.x();
                        } else {
                            strF6 = reader.F();
                        }
                        break;
                    case -173671634:
                        if (!strName.equals(ApiProtocol.KEY_CLIENT_TYPE)) {
                            reader.x();
                        } else {
                            strF5 = reader.F();
                        }
                        break;
                    case -17633304:
                        if (!strName.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            reader.x();
                        } else {
                            zV2 = reader.V();
                        }
                        break;
                    case 3355:
                        if (!strName.equals("id")) {
                            reader.x();
                        } else {
                            strF3 = reader.F();
                        }
                        break;
                    case 110541305:
                        if (!strName.equals(ApiProtocol.KEY_TOKEN)) {
                            reader.x();
                        } else {
                            strF4 = reader.F();
                        }
                        break;
                    case 781502804:
                        if (!strName.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            reader.x();
                        } else {
                            iZ = reader.z();
                        }
                        break;
                    case 828977132:
                        if (!strName.equals(ApiProtocol.KEY_IS_CONCURRENT)) {
                            reader.x();
                        } else {
                            zV = reader.V();
                        }
                        break;
                    case 836670789:
                        if (!strName.equals(ApiProtocol.KEY_TURN_SERVER)) {
                            reader.x();
                        } else {
                            turn = CallInfoParser.parseTurn(reader);
                        }
                        break;
                    case 1422043319:
                        if (!strName.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            reader.x();
                        } else {
                            strF2 = reader.F();
                        }
                        break;
                    case 1702739560:
                        if (!strName.equals(ApiProtocol.KEY_STUN_SERVER)) {
                            reader.x();
                        } else {
                            stun = CallInfoParser.parseStun(reader);
                        }
                        break;
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            reader.x();
                        } else {
                            strF = reader.F();
                        }
                        break;
                    default:
                        reader.x();
                        break;
                }
            }
            reader.t();
            return new CallInfo(strF, null, strF2, null, strF3, strF4, strF5, strF6, zV, turn, stun, zV2, iZ, 10, null);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final CallInfo startConversationDelegateResultParse(vu8 reader, String str, boolean withIp) throws JsonTypeMismatchException, IOException {
            reader.p();
            String strF = null;
            List<String> ipAddresses = null;
            String strF2 = null;
            List<String> ipAddresses2 = null;
            String strF3 = null;
            boolean zV = false;
            int iZ = 0;
            List<PeerConnection.IceServer> turn = r66.a;
            List<PeerConnection.IceServer> stun = turn;
            while (reader.hasNext()) {
                String strName = reader.name();
                switch (strName.hashCode()) {
                    case 3541178:
                        if (!strName.equals("stun")) {
                            reader.x();
                        } else {
                            stun = CallInfoParser.parseStun(reader);
                        }
                        break;
                    case 3571837:
                        if (!strName.equals("turn")) {
                            reader.x();
                        } else {
                            turn = CallInfoParser.parseTurn(reader);
                        }
                        break;
                    case 25188487:
                        if (!strName.equals("deviceIdx")) {
                            reader.x();
                        } else {
                            iZ = reader.z();
                        }
                        break;
                    case 684155794:
                        if (!strName.equals("wtEndpoint")) {
                            reader.x();
                        } else {
                            strF2 = reader.F();
                        }
                        break;
                    case 694870657:
                        if (!strName.equals("isConcurrent")) {
                            reader.x();
                        } else {
                            zV = reader.V();
                        }
                        break;
                    case 1102453157:
                        if (!strName.equals("clientType")) {
                            reader.x();
                        } else {
                            strF3 = reader.F();
                        }
                        break;
                    case 1419796927:
                        if (!strName.equals("wsIpAddresses")) {
                            reader.x();
                        } else if (!withIp) {
                            reader.x();
                        } else {
                            ipAddresses = CallInfoParser.parseIpAddresses(reader);
                        }
                        break;
                    case 1548879646:
                        if (!strName.equals("wtIpAddresses")) {
                            reader.x();
                        } else if (!withIp) {
                            reader.x();
                        } else {
                            ipAddresses2 = CallInfoParser.parseIpAddresses(reader);
                        }
                        break;
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            reader.x();
                        } else {
                            strF = reader.F();
                        }
                        break;
                    default:
                        reader.x();
                        break;
                }
            }
            reader.t();
            return new CallInfo(strF, ipAddresses, strF2, ipAddresses2, str, null, strF3, null, zV, turn, stun, false, iZ);
        }

        public final CallInfo createFromStartConversationDelegateResult$calls_sdk(StartConversationDelegate.Result.Success result, boolean withIp) {
            return startConversationDelegateResultParse(new g2d(result.getInternalCallerParams()), result.getConversationId(), withIp);
        }

        public final hu8 getPARSER() {
            return CallInfo.PARSER;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallInfo(String str, List<String> list, String str2, List<String> list2, String str3, String str4, String str5, String str6, boolean z, List<? extends PeerConnection.IceServer> list3, List<? extends PeerConnection.IceServer> list4, boolean z2, int i) {
        this.endpoint = str;
        this.wsIps = list;
        this.wtEndpoint = str2;
        this.wtIps = list2;
        this.id = str3;
        this.token = str4;
        this.clientType = str5;
        this.joinLink = str6;
        this.isConcurrent = z;
        this.turnServer = list3;
        this.stunServer = list4;
        this.isP2PForbidden = z2;
        this.deviceIndex = i;
    }

    public CallInfo() {
        this(null, null, null, null, null, null, null, null, false, null, null, false, 0, 8191, null);
    }
}
