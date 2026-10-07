package ru.ok.android.externcalls.sdk.api;

import defpackage.vu8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallInfoParser;", "", "<init>", "()V", "Lvu8;", "reader", "", "Lorg/webrtc/PeerConnection$IceServer;", "parseTurn", "(Lvu8;)Ljava/util/List;", "parseStun", "", "parseIpAddresses", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallInfoParser {
    public static final CallInfoParser INSTANCE = new CallInfoParser();

    private CallInfoParser() {
    }

    public static final List<String> parseIpAddresses(vu8 reader) throws JsonTypeMismatchException, IOException {
        ArrayList arrayList = new ArrayList();
        reader.r();
        while (reader.hasNext()) {
            arrayList.add(reader.F());
        }
        reader.q();
        return arrayList;
    }

    public static final List<PeerConnection.IceServer> parseStun(vu8 reader) throws JsonTypeMismatchException, IOException {
        ArrayList<String> arrayList = new ArrayList();
        reader.p();
        while (reader.hasNext()) {
            String strName = reader.name();
            if (strName.hashCode() == 3598564 && strName.equals("urls")) {
                reader.r();
                while (reader.hasNext()) {
                    arrayList.add(reader.F());
                }
                reader.q();
            } else {
                reader.x();
            }
        }
        reader.t();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).createIceServer());
            }
        }
        return arrayList2;
    }

    public static final List<PeerConnection.IceServer> parseTurn(vu8 reader) throws JsonTypeMismatchException, IOException {
        ArrayList<String> arrayList = new ArrayList();
        reader.p();
        String strZ = null;
        String strZ2 = null;
        while (reader.hasNext()) {
            String strName = reader.name();
            int iHashCode = strName.hashCode();
            if (iHashCode != -683415465) {
                if (iHashCode != -265713450) {
                    if (iHashCode == 3598564 && strName.equals("urls")) {
                        reader.r();
                        while (reader.hasNext()) {
                            arrayList.add(reader.F());
                        }
                        reader.q();
                    } else {
                        reader.x();
                    }
                } else if (strName.equals("username")) {
                    strZ2 = reader.Z();
                } else {
                    reader.x();
                }
            } else if (strName.equals("credential")) {
                strZ = reader.Z();
            } else {
                reader.x();
            }
        }
        reader.t();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).setUsername(strZ2).setPassword(strZ).setTlsCertPolicy(PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE).createIceServer());
            }
        }
        return arrayList2;
    }
}
