package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pu2 extends zq0 {
    public final long b;
    public final List c;
    public final Map d;

    public pu2(long j, long j2, List list, Map map) {
        super(j);
        this.b = j2;
        this.c = list;
        this.d = map;
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "ChatBotCommandsEvent{chatId=" + this.b + ", botCommands count=" + this.c.size() + ", botsInfoMap count=" + this.d.size() + "} " + super.toString();
    }
}
