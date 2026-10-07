package defpackage;

import ru.ok.tamtam.android.messages.comments.MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class vea extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vea(MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker messageCommentsCleanupScheduler$MessageCommentsCleanupWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = messageCommentsCleanupScheduler$MessageCommentsCleanupWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
