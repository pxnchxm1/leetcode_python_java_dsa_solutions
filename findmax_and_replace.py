class Node:
    def __init__(self, data):
        self.data=data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.n=0
    def __len__(self):
        return self.n
    def __str__(self):
        if self.n==0:
            return "Empty LL"
        else:
            res=''
            curr= self.head
            while curr!=None:
                res+=str(curr.data)+'->'
                curr=curr.next
            return res[:-2]
    def insert_head(self,value):
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node
        self.n+=1
    
    def insert_tail(self,value):
        new_node = Node(value)
        if self.head==None:
            self.head = new_node
            self.n+=1
            return
        else:
            curr = self.head
            while curr.next!=None:
                curr=curr.next
            curr.next = new_node
            self.n+=1
            return
    def insert_after(self,after,value):
        new_node = Node(value)
        curr = self.head
        while curr!=None:
            if curr.data==after:
                break
            curr=curr.next
        if curr!=None:
            new_node.next = curr.next
            curr.next = new_node
            self.n+=1
            return
        else:
            return 'Value not found'
    def clear(self):
        self.head = None
        self.n=0
        return
    def delete_head(self):
        if self.head==None:
            return 'Empty LL'
        else:
            self.head =  self.head.next
            self.n-=1
        return
    def delete_tail(self):
        if self.head==None:
            return 'Empty LL'
        else:
            curr = self.head
            while curr.next.next!=None:
                curr=curr.next
            curr.next = None
            self.n-=1
        return
    def delete_after(self,after):
        curr = self.head
        while curr!=None:
            if curr.data==after:
                break
            curr=curr.next
        if curr!=None:
            curr.next = curr.next.next
            self.n-=1
            return
        else:
            return 'Value not found'
    def search_value(self,value):
        curr = self.head
        pos=0
        while curr!=None:
            if curr.data==value:
                return pos
            curr=curr.next
            pos+=1
        return 'Value not found'
    def search_idx(self,idx):
        curr = self.head
        pos=0
        while curr!=None:
            if pos==idx:
                return curr.data
            curr=curr.next
            pos+=1
        return 'Index Out Of Range'
    #DSA: 1 -- Replace maximum value in ur LL with given value
    def replace_max_with(self,value):
        curr=self.head
        max_val=float("-inf")
        while curr!=None:
            if curr.data>max_val:
                max_val=curr.data
            curr=curr.next
        curr=self.head
        while curr!=None:
            if curr.data==max_val:
                curr.data=value
            curr=curr.next
        return 
    #DSA: 2 -- Return odd place sum
    def odd_place_sum(self):
        s=0
        pos=1
        if self.head==None :
            return s
        curr=self.head.next
        while curr!=None:
            if pos%2!=0:
                s+=curr.data
            pos+=1
            curr=curr.next
        return s
        



num=20
ll=LinkedList()
print(ll)
# ll.insert_tail(20)
# ll.insert_tail(22)
# print(ll)
#q1
# print(ll.replace_max_with(num))
#q2
print(ll.odd_place_sum())

    

    

    
        
    





