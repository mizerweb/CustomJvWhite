package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public abstract class u94 {
    /* JADX WARN: switch over string: strings are not added: [[6M]] */
    public static v94 a(byte[] bArr) throws ProtoException {
        lni lniVarA = null;
        try {
            Tasks.Config config = (Tasks.Config) sia.mergeFrom(new Tasks.Config(), bArr);
            long j = config.requestId;
            long j2 = config.chatId;
            boolean z = config.isPushToken;
            Map<String, String> map = config.userSettings;
            if (map != null && !map.isEmpty()) {
                ini iniVarA = lni.a();
                if (map.containsKey("pushNewContacts")) {
                    iniVarA.s(Boolean.valueOf(Boolean.parseBoolean(map.get("pushNewContacts"))));
                }
                if (map.containsKey("dontDustirbUntil")) {
                    iniVarA.m(Long.valueOf(Long.parseLong(map.get("dontDustirbUntil"))));
                }
                if (map.containsKey("dialogsPushNotification")) {
                    iniVarA.j(map.get("dialogsPushNotification"));
                }
                if (map.containsKey("chatsPushNotification")) {
                    iniVarA.e(map.get("chatsPushNotification"));
                }
                if (map.containsKey("pushSound")) {
                    iniVarA.t(map.get("pushSound"));
                }
                if (map.containsKey("dialogsPushSound")) {
                    iniVarA.k(map.get("dialogsPushSound"));
                }
                if (map.containsKey("chatsPushSound")) {
                    iniVarA.f(map.get("chatsPushSound"));
                }
                if (map.containsKey("hiddenOnline")) {
                    iniVarA.o(Boolean.valueOf(map.get("hiddenOnline")));
                }
                if (map.containsKey("led")) {
                    iniVarA.r(Integer.valueOf(map.get("led")));
                }
                if (map.containsKey("dialogsLed")) {
                    iniVarA.i(Integer.valueOf(map.get("dialogsLed")));
                }
                if (map.containsKey("chatsLed")) {
                    iniVarA.d(Integer.valueOf(map.get("chatsLed")));
                }
                if (map.containsKey("vibration")) {
                    iniVarA.w(Boolean.valueOf(Boolean.parseBoolean(map.get("vibration"))));
                }
                if (map.containsKey("dialogsVibration")) {
                    iniVarA.l(Boolean.valueOf(Boolean.parseBoolean(map.get("dialogsVibration"))));
                }
                if (map.containsKey("chatsVibration")) {
                    iniVarA.g(Boolean.valueOf(Boolean.parseBoolean(map.get("chatsVibration"))));
                }
                if (map.containsKey("chatsInvite")) {
                    iniVarA.c(nbh.c(map.get("chatsInvite")));
                }
                if (map.containsKey("incomingCall")) {
                    iniVarA.q(nbh.c(map.get("incomingCall")));
                }
                if (map.containsKey("inactiveTTL")) {
                    String str = map.get("inactiveTTL");
                    kni kniVar = kni.TTL_6M;
                    if (str != null) {
                        switch (str) {
                            case "1M":
                                kniVar = kni.TTL_1M;
                                break;
                            case "3M":
                                kniVar = kni.TTL_3M;
                                break;
                        }
                    }
                    iniVarA.p(kniVar);
                }
                if (map.containsKey("groupChatCallNotificationStatus")) {
                    iniVarA.n(nbh.b(map.get("groupChatCallNotificationStatus")));
                }
                if (map.containsKey("commentsPushNotification")) {
                    iniVarA.h(nbh.a(map.get("commentsPushNotification")));
                }
                if (map.containsKey("suggestStickersStatus")) {
                    iniVarA.u(nbh.d(map.get("suggestStickersStatus")));
                }
                if (map.containsKey("audioTranscriptionEnabled")) {
                    iniVarA.b(Boolean.valueOf(Boolean.parseBoolean(map.get("audioTranscriptionEnabled"))));
                }
                if (map.containsKey("unsafeFiles")) {
                    iniVarA.v(Boolean.valueOf(Boolean.parseBoolean(map.get("unsafeFiles"))));
                }
                lniVarA = iniVarA.a();
            }
            return new v94(j, j2, z, lniVarA, config.reset, config.syncChatIds);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
