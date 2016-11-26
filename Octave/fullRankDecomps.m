function [B,C] = fullRankDecomps(A)
%[B,C] = fullRankDecomps(A),decompose A to B and C,let A = B * C
%USAGE:
% example:      A = [1,2,3;4,5,3];
%               [b,c] = fullRankDecomps(A);
%               b = [1,2;4,5]
%               c = [1,0,-3;0,1,3]

%get the row reduced echelon form
M = rref(A);
[rows,colums] = size(M);

%set p is the row full rank matrix
p(1:rows,:) = 0;
%set q is the columns full rank matrix
q(:,1:colums) = 0;

for i = 1:rows
    for j = 1:colums
        %if M(i,j) is the only non-zero pivot
        if M(i,j) == 1 && sum(M(:,j)) == 1
            p = [p,A(:,j)];
            q = [q;M(i,:)];
        end
    end
end
B = p(:,2:end);
C = q(2:end,:);


