public class BackPack{
static int knapsack(int index, int capacity,int[] weight,int[] value){
if(index==0){
if(weight[0]<=capacity)
return value[0];
return 0;
}
int notTake=knapsack(index-1,capacity,weight,value);
int take=Integer.MIN_VALUE;
if(weight[index] <= capacity){
take=value[index]+knapsack(index-1,capacity-weight[index],weight,value);
}
return Math.max(take,notTake);
}
public static void main(String[]args){
int capacity=5;
int[] weight={2,3,1,2};
int[] value={40,60,70,120};
int index=value.length-1;
System.out.println(knapsack(index,capacity,weight,value));
}
}