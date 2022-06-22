package lolka.example.PsyPath.presentation.fragment.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Llolka/example/PsyPath/presentation/fragment/adapter/MessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Llolka/example/PsyPath/presentation/fragment/adapter/MessageAdapter$MessageHolder;", "()V", "messageList", "Ljava/util/ArrayList;", "Llolka/example/PsyPath/presentation/fragment/adapter/MessageModel;", "getMessageList", "()Ljava/util/ArrayList;", "addMessage", "", "message", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MessageHolder", "app_debug"})
public final class MessageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<lolka.example.PsyPath.presentation.fragment.adapter.MessageAdapter.MessageHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<lolka.example.PsyPath.presentation.fragment.adapter.MessageModel> messageList = null;
    
    public MessageAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<lolka.example.PsyPath.presentation.fragment.adapter.MessageModel> getMessageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public lolka.example.PsyPath.presentation.fragment.adapter.MessageAdapter.MessageHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.adapter.MessageAdapter.MessageHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.adapter.MessageModel message) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Llolka/example/PsyPath/presentation/fragment/adapter/MessageAdapter$MessageHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Llolka/example/PsyPath/databinding/FragmentMessageBinding;", "getBinding", "()Llolka/example/PsyPath/databinding/FragmentMessageBinding;", "bind", "", "message", "Llolka/example/PsyPath/presentation/fragment/adapter/MessageModel;", "app_debug"})
    public static final class MessageHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final lolka.example.PsyPath.databinding.FragmentMessageBinding binding = null;
        
        public MessageHolder(@org.jetbrains.annotations.NotNull()
        android.view.View item) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final lolka.example.PsyPath.databinding.FragmentMessageBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        lolka.example.PsyPath.presentation.fragment.adapter.MessageModel message) {
        }
    }
}