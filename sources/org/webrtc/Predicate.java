package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.2
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t) {
                return this.this$0.test(t) && predicate.test(t);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate
            public boolean test(T t) {
                return !Predicate.this.test(t);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.1
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t) {
                return this.this$0.test(t) || predicate.test(t);
            }
        };
    }

    boolean test(T t);
}
