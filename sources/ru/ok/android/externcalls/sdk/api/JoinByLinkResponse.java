package ru.ok.android.externcalls.sdk.api;

import defpackage.eu6;
import defpackage.hu8;
import defpackage.vu8;
import defpackage.zo5;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.rate.RateCallData;

/* JADX INFO: loaded from: classes3.dex */
public final class JoinByLinkResponse {
    public static final hu8 PARSER = new eu6(24);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isP2PForbidden;
    public final List<PeerConnection.IceServer> stun;
    public final String token;
    public final List<PeerConnection.IceServer> turn;
    public final String wtEndpoint;

    public JoinByLinkResponse(String str, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.id = str;
        this.deviceIndex = i;
        this.turn = list;
        this.endpoint = str2;
        this.wtEndpoint = str3;
        this.token = str4;
        this.isP2PForbidden = z;
        this.stun = list2;
        this.clientType = str5;
    }

    public static /* synthetic */ JoinByLinkResponse lambda$static$0(vu8 vu8Var) throws JsonParseException, IOException {
        List<PeerConnection.IceServer> list = Collections.EMPTY_LIST;
        vu8Var.p();
        List<PeerConnection.IceServer> turn = list;
        List<PeerConnection.IceServer> stun = turn;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        boolean zV = false;
        int iZ = 0;
        while (vu8Var.hasNext()) {
            String strName = vu8Var.name();
            strName.getClass();
            switch (strName) {
                case "client_type":
                    strF5 = vu8Var.F();
                    break;
                case "p2p_forbidden":
                    zV = vu8Var.V();
                    break;
                case "id":
                    strF = vu8Var.F();
                    break;
                case "token":
                    strF4 = vu8Var.F();
                    break;
                case "device_idx":
                    iZ = vu8Var.z();
                    break;
                case "turn_server":
                    turn = CallInfoParser.parseTurn(vu8Var);
                    break;
                case "wt_endpoint":
                    strF3 = vu8Var.F();
                    break;
                case "stun_server":
                    stun = CallInfoParser.parseStun(vu8Var);
                    break;
                case "endpoint":
                    strF2 = vu8Var.F();
                    break;
                default:
                    vu8Var.x();
                    break;
            }
        }
        vu8Var.t();
        return new JoinByLinkResponse(strF, turn, stun, strF2, strF3, strF4, strF5, zV, iZ);
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turn);
        linkedList.addAll(this.stun);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.wtEndpoint = this.wtEndpoint;
        conversationParams.deviceIndex = this.deviceIndex;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        conversationParams.isP2PForbidden = this.isP2PForbidden;
        return conversationParams;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinByLinkResponse{id='");
        sb.append(this.id);
        sb.append("', deviceIndex='");
        sb.append(this.deviceIndex);
        sb.append("', turn=");
        sb.append(this.turn);
        sb.append(", endpoint='");
        sb.append(this.endpoint);
        sb.append("', wtEndpoint='");
        sb.append(this.wtEndpoint);
        sb.append("', token='");
        return zo5.w(sb, this.token, "'}");
    }

    public ConversationParams toParams(ConversationParams conversationParams) {
        ConversationParams conversationParams2 = new ConversationParams();
        LinkedList linkedList = new LinkedList(this.turn);
        if (conversationParams != null) {
            conversationParams2.rateCallData = conversationParams.rateCallData;
            linkedList.addAll(conversationParams.stunTurnServers);
        } else {
            conversationParams2.rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
        }
        conversationParams2.endpoint = this.endpoint;
        conversationParams2.deviceIndex = this.deviceIndex;
        conversationParams2.token = this.token;
        conversationParams2.stunTurnServers = linkedList;
        return conversationParams2;
    }
}
