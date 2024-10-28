package com.yuyan.imemodule.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.emoji2.widget.EmojiTextView
import androidx.recyclerview.widget.RecyclerView
import com.yuyan.imemodule.R
import com.yuyan.imemodule.data.theme.ThemeManager.activeTheme
import com.yuyan.imemodule.utils.StringUtils.sbc2dbcCase

/**
 * 表情或符号界面适配器
 * User:Gaolei  gurecn@gmail.com
 * Date:2017/7/20
 * I'm glad to share my knowledge with you all.
 */
class SymbolAdapter(context: Context?,  val viewType: Int, private val onClickEmoji: (String, Int) -> Unit) :
    RecyclerView.Adapter<SymbolAdapter.SymbolHolder>() {
    private val textColor: Int
    private val inflater: LayoutInflater
    var mDatas: List<String>? = null

    init {
        val theme = activeTheme
        textColor = theme.keyTextColor
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SymbolHolder {
        val view = inflater.inflate(R.layout.sdk_item_recyclerview_symbols_emoji, parent, false)
        return SymbolHolder(view)
    }

    override fun onBindViewHolder(holder: SymbolHolder, position: Int) {
        if (viewType == 0) {
            holder.textView.text = sbc2dbcCase(getItem(position)) // 中文符号显示半角
        } else {
            holder.textView.text = getItem(position)
        }
        holder.textView.setOnClickListener { _: View? ->
            onClickEmoji(getItem(position), position)
        }
    }

    override fun getItemCount(): Int {
        return mDatas?.size?:0
    }

    inner class SymbolHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: EmojiTextView
        init {
            textView = view.findViewById(R.id.gv_item)
            textView.setTextColor(textColor)
        }
    }

    fun getItem(position: Int): String {
        return mDatas!![position]
    }
}
